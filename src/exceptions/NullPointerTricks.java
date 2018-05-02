package exceptions;

public class NullPointerTricks {


//    static {                                                          /*Initializer must complete normally*/
//        throw new NullPointerException();
//    }
    public static void m1 () {

        try {
            Exception ex = null;
            throw ex;
        } catch (Exception e) {
            System.out.println("All ok");
        }

    }

    public static void m2() throws Exception {
        Exception e = null;
        throw e;
    }

    public static void m3() {
        Exception e = null;
   //     throw  e;   // Unhandled exception. Compilation failed
    }

    public static final void main(String[] args) {
        m1();
        someMethod();  // will throw RuntimeException()
    }

    static class MyException extends Exception {}

    public static void method_m1() throws MyException {
        throw new MyException();
    }

    public static void method_m2(){
        throw new RuntimeException();
    }

    public static void someMethod() {
        try {
            method_m1();
        } catch (MyException e) {
     //       method_m1();    // Unhandled  MyException()
        } finally {
            method_m2();
        }
    }

}
