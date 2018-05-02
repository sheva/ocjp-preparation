package patterns.singletone;

/**
 * Cons: "volatile could lead to performance problems in multithreading env
 *
 *  * !!! of every singleton: inheritance, several class-loaders( exmaple Servlets), 2 of more JVMs
 */
public class SingletoneVolatile {

    private static volatile SingletoneVolatile instance;  // as of Java 5
    private SingletoneVolatile() {}

    public static SingletoneVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletoneVolatile.class) {
                if (instance == null) {
                    instance = new SingletoneVolatile();
                }
            }
        }
        return instance;
    }

    // OR
//    public SingletoneVolatile getInstance() {
//        if (instance == null) {
//            synchronized (this) {
//                if (instance == null) {
//                    instance = new SingletoneVolatile();
//                }
//            }
//        }
//        return instance;
//    }
}
