package javaBasics;

public abstract class AbstractClassCompileAndExecuteFine {
    int a;

    /* Perfectly legal to create constructor */
    AbstractClassCompileAndExecuteFine(){
        a = 1;
    }

    abstract void m1();

    public static void main(String[] args) {
        System.out.println("Ok");
        // Abstract class could not be instantiated!!!
        //  AbstractClassCompileAndExecuteFine obj = new AbstractClassCompileAndExecuteFine();

        AbstractClassCompileAndExecuteFine obj = null;
        obj.m1();  // Will produce NullPointerException
    }

}
