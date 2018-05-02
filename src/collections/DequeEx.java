package collections;

import java.util.Comparator;
import java.util.LinkedList;

public class DequeEx {

    public static void main(String... args) {
        LinkedList<String> deque = new LinkedList<>();
        deque.add("b");
        deque.add("a");
        deque.add("c");
        deque.add("a");

        deque.sort(Comparator.naturalOrder());
        System.out.println(deque);
        System.out.println(deque.pollLast()); //'c'
        System.out.println(deque.pollFirst()); //'a'
        System.out.println(deque.poll()); //'a'   // head
        deque.add("k"); //add to tail
        System.out.println(deque.getLast()); //'k'
    }
}
