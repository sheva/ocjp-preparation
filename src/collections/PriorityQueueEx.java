package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

    public static void main(String... args) {
        String[] arr = new String[]{"a", "c", "aa", "b"};
        //OR
//        String[] arr = {"a", "c", "aa", "b"};

        PriorityQueue<String> queue1 = new PriorityQueue<>();
        for (String val : arr) {
            queue1.offer(val);
            //OR
//            queue.add();

        }
//        queue1.offer(null); --> NullPointerException
//        queue1.add(null); --> NullPointerException

        System.out.println(queue1);
        for (String x : arr) {
            System.out.print(queue1.poll() + " ");
        }

        PriorityQueue<String> queue2 = new PriorityQueue<>(Comparator.reverseOrder());
        //OR
//        PriorityQueue<String> queue2 = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
        System.out.println(queue2);
        for (String val : arr) {
            queue2.offer(val);
        }

        System.out.println(queue2.size());  //4
        System.out.println(queue2.poll()); // 'c'
        System.out.println(queue2.size());  //3
        System.out.println(queue2.peek()); //'b'
        System.out.println(queue2.size()); //3
    }
}
