package concurrency;

/**
 * Q: Give a piece of code. What is true?
 *
 * A) This code may throw an InterruptedException
 * B) This code may throw an IllegalStateException
 * C) This code may throw a TimeOutException
 * D) Reversing the order of o.wait() and o.notify() will cause this method to complete normally.
 *
 * A: A) This code may throw an InterruptedException
 */
public class ObjectWaitNotify {

    public static void waitForSomething() throws InterruptedException {
        ObjectWaitNotify o = new ObjectWaitNotify();
        synchronized (o) {
            o.wait();        //?????
            o.notify();      //?????
        }
    }

    public static void main(String arg[]) throws InterruptedException {
        waitForSomething();
    }
}
