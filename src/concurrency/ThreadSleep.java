package concurrency;

/**
 * Q: Given the code. What is the result?
 *
 * A) Compilation fails.
 * B) An exception is thrown at runtime.
 * C) "book" is printed
 * D) The code executes normally, but nothing is printed.
 *
 * A: C)"book" is printed
 */
public class ThreadSleep {

    private static void book() {
        System.out.print("book");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);  // Thread.sleep(-1) causes runtime IllegalArgumentException
        book();
    }
}
