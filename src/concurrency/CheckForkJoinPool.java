package concurrency;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Q: Consider the following statements. What is true?
 *
 * 1) There is no need to explicitly shutting down the ForkJoinPool when exit
 * 2) ForkJoinPool uses threads in a daemon mode
 * 3) ForkJoinPool could have any number of threads
 *
 * A: 1) & 2)
 *
 * limited 32767 threads (max integer)
 */
public class CheckForkJoinPool {

    public interface Node {
        Collection<Node> getChildren();
        long getValue();
    }

    public static class NodeExc implements Node {
        long value;
        Collection<Node> children;

        NodeExc(long value, Collection<Node> children) {
            this.value = value;
            this.children = children;
        }

        NodeExc(long value) {
            this(value, new LinkedList<Node>());
        }

        @Override
        public Collection<Node> getChildren() {
            return children;
        }

        @Override
        public long getValue() {
            return value;
        }
    }

    public static class ValueSumCounter extends RecursiveTask<Long> {

        private final Node node;

        ValueSumCounter(Node node) {
            this.node = node;
        }

        @Override
        protected Long compute() {
            long sum = node.getValue();
            List<ValueSumCounter> subTasks = new LinkedList<ValueSumCounter>();

            for(Node child : node.getChildren()) {
                ValueSumCounter task = new ValueSumCounter(child);
                task.fork(); // run asynchronous
                subTasks.add(task);
            }

            for(ValueSumCounter task : subTasks) {
                sum += task.join(); //wait for result and multiply
            }
            System.out.println("sum: " + sum);
            return sum;
        }
    }

    public static void main(String[] args) {

        Node root = new Node() {
            @Override
            public Collection<Node> getChildren() {

                return new LinkedList<Node>(
                        Arrays.asList(new NodeExc(43), new NodeExc(3),
                                new NodeExc(7, new LinkedList<Node>(Arrays.asList(new NodeExc(5))))));
            }

            @Override
            public long getValue() {
                return 10;
            }
        };

        System.out.println("Result: " + new ForkJoinPool().invoke(new ValueSumCounter(root)));
    }
}
