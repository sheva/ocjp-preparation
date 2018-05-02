package javaBasics;

interface Foo {}
class Alpha implements Foo {}
class Beta extends Alpha {}
class Gamma extends Beta {}

public class ClassCast2 {

        public static void main(String[] args) {
            ClassCast classCast = new ClassCast();
            Beta b = new Beta();
//            Foo x = (Gamma) b;      // Causes ClassCastException
            Beta y = (Beta)(Alpha)b;
//            Gamma g = b;            // compilation fails
//            Gamma g = (Gamma) b;     // compilation fails
            intt(new Integer(4));
            new ClassCast2().m1(new Integer(5));
        }

    static class B {

        int k =1;

    }

    public static void intt(int i) {
        i = new Integer(5) + 7;
        System.out.println("here");
        System.out.println(new String("here").intern());
    }

    void m1(Integer i) {
        System.out.println("h");
    }

    void m1(int i) {
        System.out.println("t");
    }
}
