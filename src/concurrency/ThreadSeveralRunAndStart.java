package concurrency;

/**
 * Q: Given the code. What is the result?
 *
 *  A) Compilation fails.
 *  B) An exception is thrown at runtime.
 *  C) "go" is printed
 *  D) "gogogo" is printed
 *  E) "gogo" is printed
 *
 * A: D) "gogogo" is printed
 */
public class ThreadSeveralRunAndStart implements Runnable {

    public void run() {
        System.out.print("go");
    }

    public static void main(String arg[]) throws InterruptedException {
        Thread t = new Thread(new ThreadSeveralRunAndStart());
        t.run();
        t.run();
        t.start();
//        t.start();    // throws IllegalThreadStateException
    }
}
