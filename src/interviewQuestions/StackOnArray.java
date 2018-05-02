package interviewQuestions;

public class StackOnArray {

    private int[] array;
    private int size;
    private int top;

    StackOnArray(int size) {
        this.array = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("StackLinkedList is already full!");
        }

        top++;
        array[top] = element;
        System.out.println("Pushed element = " + element);
}

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("StackLinkedList is empty! Nothing to retrieve!");
        }

        int element = array[top];
        top--;
        System.out.println("Retrieved element = " + element);
        return element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int peek() {
        return array[top];
    }

    public static StackOnArray sortStack(StackOnArray stack) {
        StackOnArray tempStack = new StackOnArray(stack.size);
        while(!stack.isEmpty()) {
            int currentData = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > currentData) {
                stack.push(tempStack.pop());
            }
            tempStack.push(currentData);
        }
        return tempStack;
    }

    public static void main(String... args) {

        StackOnArray stack = new StackOnArray(4);
        System.out.println("Is empty = " + stack.isEmpty());
        System.out.println("Is full = " + stack.isFull());
        stack.push(10);
        stack.push(5);
        stack.push(24);
        stack.push(3);
        try {
            stack.push(60);
        } catch (RuntimeException e) {
            System.out.println("Error  - ok");
        }
        System.out.println("Is full = " + stack.isFull());
        StackOnArray sorted = sortStack(stack);
        System.out.println("Return element = "  + stack.pop());
        System.out.println("Return element = "  + stack.pop());

    }

}
