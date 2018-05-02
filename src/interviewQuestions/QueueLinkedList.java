package interviewQuestions;

import java.util.EmptyStackException;
import java.util.Scanner;

public class QueueLinkedList<T> {

    private Node<T> last;
    private Node<T> first;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data + " " + next;
        }
    }

    public void add(T data) {
        Node<T> dataNode = new Node<T>(data);
        if (first == null) {
            first = dataNode;
        }

        if (last != null) {
            last.next = dataNode;
        }
        last = dataNode;
    }

    public T remove() {
        if (isEmpty()) throw new EmptyStackException();
        Node<T> res = first;
        first = res.next;
        if (first == null) {
            last = null;
        }
        return res.data;
    }

    public T peak() {
        if (isEmpty()) throw new EmptyStackException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }


    public static final synchronized void main(String... args) {
        QueueLinkedList<String> queue = new QueueLinkedList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            queue.add(in.nextLine());
        }

        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
    }
}
