package interviewQuestions;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackLinkedList<T> {

    private StackNode<T> top;

    static class StackNode<T> {
        T data;
        StackNode<T> next;

        StackNode(T data, StackNode<T> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data + " " + next;
        }
    }

    public void push(T data) {
        top = new StackNode<>(data, top);
    }

    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        StackNode<T> result = top;
        top = top.next;
        return result.data;
    }

    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String... args) {
        StackLinkedList<String> myStack = new StackLinkedList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            myStack.push(in.nextLine());
        }

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}
