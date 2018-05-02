package concurrency;

/**
 * Q: Given the code. What is the result?
 *
 *  A) Compilation fails.
 *  B) An exception is thrown at runtime.
 *  C) "BeginRunEnd" is printed.
 *  D) "BeginEndRun" is printed.
 *  E) "BeginEnd" is printed.
 *
 *  A: A) Compilation fails. (InterruptedException should be in declaration of main method.)
 */
public class ThreadStartJoin implements Runnable {
    public static void main(String[] args) {
        Thread a = new Thread(new ThreadStartJoin());
        a.start();

        System.out.print("Begin");
//        a.join();
        System.out.print("End");
    }

    public void run() {
        System.out.print("Run");
    }
}
