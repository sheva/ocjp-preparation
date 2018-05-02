package concurrency;

/**
 * Q: Given the code. What is the result?
 *
 * A) Compilation fails.
 * B) An exception is thrown at runtime.
 * C) "book" is printed.
 * D) The code executes normally, but nothing is printed.
 *
 * A: A) Compilation fails. Unhandled exception InterruptedException
 */
public class ThreadStart_Test {

    private static void book() {
        System.out.print("book");
    }

    public static void main(String[] args) {
//       Thread.sleep(1);   // Caused compilation failure because of declaration of InterruptedException in main method
        book();

    }
}
