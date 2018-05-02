package concurrency;

/**
 * Q: What will happen if run the following code?
 *
 * A) It will print "Starting main"
 * B) It will print "Main returns"
 * C) It will not print "Main returns"
 * D) The program will never exit
 * E) main method will never return
 *
 * A: A) + B) + D)
 *
 * But if me make thread daemon (thread.setDaemon(true)) the program will exit.
 */
public class NeverendingLoop extends Thread {

    @Override
    public void run() {
        for (;;);
    }

    public static void main(String[] args) {
        System.out.println("Starting Main");
        new NeverendingLoop().start();
        System.out.println("Main returns");
    }
}

