package patterns.singletone;

/**
 * Cons: Synchronization is useful only at first call. Another times - redundant and increase time.
 *
 *  * !!! of every singleton: inheritance, several class-loaders( exmaple Servlets), 2 of more JVMs
 */
public class SingletoneSynchronized {

    private static SingletoneSynchronized instance;
    private SingletoneSynchronized() {}

    public static synchronized SingletoneSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletoneSynchronized();
        }
        return instance;
    }
}
