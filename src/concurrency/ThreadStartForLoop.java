package concurrency;

/**
 * Q: Give a piece of code. Which two are possible results? (Select two)
 *
 *  A) 0, 2, 4, 0, 2, 4, 6, 6,
 *  B) 0, 2, 4, 6, 8, 10, 12, 14,
 *  C) 0, 2, 4, 6, 8, 10, 2, 4,
 *  D) 0, 0, 2, 2, 4, 4, 6, 6, 8, 8, 10, 10, 12, 12, 14, 14,
 *  E) 0, 2, 4, 6, 8, 10, 12, 14, 0, 2, 4, 6, 8, 10, 12, 14,
 *
 *  A: A)B)
 *
 *  Explanation: (D) & E) does not suit because of "for (int i = 0; i < 4; i++)"  max allowed is "a==6" 4 times of execution per thread
 *  and C) because of absence second "0" in sequence for execution of second thread)
 */
public class ThreadStartForLoop {
    private int a = 0;

    public void foo() {
        Runnable r = new LittleCruiser();
        new Thread(r).start();
        new Thread(r).start();
    }

    public static void main(String arg[]) {
        ThreadStartForLoop c = new ThreadStartForLoop();
        c.foo();
    }

    public class LittleCruiser implements Runnable {
        public void run() {
            int current;
            for (int i = 0; i < 4; i++) {
                current = a;
                System.out.print(Thread.currentThread().getId() + " " + current + ", ");
                a = current + 2;
            }
        }
    }
}
