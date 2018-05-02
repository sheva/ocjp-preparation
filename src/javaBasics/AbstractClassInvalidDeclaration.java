package javaBasics;

/**
 * Q: What will be the result of compiling and running the following code?
 *
 * 1) Compiler error - abstract classes can't have final methods
 * 2) Compiler error - abstract classes can't have constructors
 * 3) Compiler error - abstract classes can't have final methods
 * 4) Compiler error - abstract methods can't be synchronized
 * 5) Compiler error - abstract classes can't be instantiated
 * 6) Code compiles and runs without errors
 *
 * A: 4) combination of "abstract" and "synchronized" is not allowed
 * (Whether or not a method is synchronized is an implementation detail of the method.
 * Synchronization isn't specified anywhere as a declarative contract - it's not like you can synchronize in interfaces, either.)
 */
public abstract class AbstractClassInvalidDeclaration {
     private static int a= 1;
    final void finalFunc() {}
//    abstract synchronized void abstractSync();   // Causes compilation failure
    abstract void abstractFunc();
    synchronized void sync() {}
    static void stat() {}

    AbstractClassInvalidDeclaration() {}

    public void main (String[] args) {
        AbstractClassInvalidDeclaration a;
    }
}

