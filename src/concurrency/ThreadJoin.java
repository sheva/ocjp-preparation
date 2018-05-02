package concurrency;

/**
 * Q: Given the code. What is the result?
 *
 * A) Compilation fails.
 * B) An exception is thrown at runtime.
 * C) "BeginRunEnd" is printed.
 * D) "BeginEndRun" is printed.
 * E) "BeginEnd" is printed.
 *
 * A: C) "BeginRunEnd" is printed.
 */
public class ThreadJoin implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new ThreadJoin());
        a.start();

        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }

    public void run() {
        System.out.print("Run");
    }
}
