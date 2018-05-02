package patterns.singletone;

/**
 * Cons: ThreadLocal var, is slow since of Java 1.2, improved in Java 1.4
 *
 *  * !!! of every singleton: inheritance, several class-loaders( exmaple Servlets), 2 of more JVMs
 */
public class SingletoneValidThreadlocal {

    private SingletoneValidThreadlocal() {
        System.out.println("In constructor");
    }

    private static SingletoneValidThreadlocal instance;

    private static final ThreadLocal perThreadInstance = new ThreadLocal();

    public static SingletoneValidThreadlocal getInstance() {

        System.out.println(Thread.currentThread().getName());
        System.out.println(perThreadInstance.get());
        if (perThreadInstance.get() == null) {
            createInstance();
        }

        return instance;
    }

    @SuppressWarnings("unchecked")
    private static void createInstance() {

        synchronized (SingletoneValidThreadlocal.class) {
            if (instance == null) {
                instance = new SingletoneValidThreadlocal();
            }
        }

        perThreadInstance.set(perThreadInstance);
    }

    public static void main (String [] args) {
        Thread[] threads = {createNewThread(1), createNewThread(2), createNewThread(3), createNewThread(4)};
        for (Thread thread : threads) {
            thread.start();
        }
    }

    private static Thread createNewThread(int i) {
        return new Thread("Thread #" + i) {
            @Override
            public void run() {
                SingletoneValidThreadlocal.getInstance();
            }
        };
    }


}
