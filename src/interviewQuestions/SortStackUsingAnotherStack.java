package interviewQuestions;

import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Scanner;

public class SortStackUsingAnotherStack {

    public static class Stack<T> {

        private Node<T> top;

        static class Node<T> {
            T data;
            Node<T> next;

            Node(T data, Node<T> next) {
                this.data = data;
                this.next = next;
            }

            @Override
            public String toString() {
                return data + " " + next;
            }
        }

        public void push(T data) {
            Node<T> node = new Node<T>(data, top);
            top = node;
        }

        public T pop() {
            if (isEmpty()) throw new EmptyStackException();
            Node<T> res = top;
            top = res.next;
            return res.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public T peek() {
            if (isEmpty()) throw new EmptyStackException();
            return top.data;
        }

        public Stack<T> sort(Comparator<T> comparator) {

            Stack<T> sorted = new Stack<>();
            Node<T> temp = top;

            while (temp != null) {

                T data = temp.data;

                if (sorted.top == null) {
                    sorted.push(data);
                } else {

                    Node<T> currentSorted = sorted.top, previousSorted = currentSorted;

                    while (currentSorted != null) {

                        int compareRes = comparator.compare(data, currentSorted.data);

                        if (compareRes > 0) {
                            previousSorted = currentSorted;
                            currentSorted = currentSorted.next;

                            if (currentSorted == null) {
                                previousSorted.next = new Node<>(data, null);
                                break;
                            }

                        } else {
                            previousSorted.next = new Node<>(data, currentSorted);
                            sorted.top = previousSorted;
                            break;
                        }
                    }
                }

                temp = temp.next;
            }

            return sorted;
        }

    }



    public static void main(String... args) {
        Stack<Integer> initialStack = new Stack<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            initialStack.push(in.nextInt());
        }

        System.out.println("Let's start sorting");
        initialStack.sort((o1,o2) -> o1.intValue() - o2.intValue());
        System.out.println(initialStack);
    }

}
