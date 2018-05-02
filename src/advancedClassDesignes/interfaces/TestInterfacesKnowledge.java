package advancedClassDesignes.interfaces;

import java.io.IOException;

public class TestInterfacesKnowledge {

    interface A {
        String message = "I am interface A";

        public abstract void m4();

        default void m1() throws Exception {
            System.out.println("A");
        }

        static void m2() {
            System.out.println("static A");
        }

        default void m3() {
            System.out.println("A");
        }
    }

    interface B {
        default void m1() throws IOException {
            System.out.println("B");
        }

        static void m2() {
            System.out.println("static B");
        }

        void m3();
    }

    public interface C {
    }

    static class SeveralIfaces implements A, B {
        @Override
        public void m1() throws IOException {
//  public void m1() WRONG!!!! throw Exception {
        }

        public void m2() {} // Is ok but not overridden

        @Override
        public void m3() {
            System.out.println("in class implementation");
        }

        @Override
        public void m4() {
            System.out.println("Implemented");
        }
    }

    public static void main(String[] args) throws Exception{
        // Impossible to call static interface  methods on instance
        // new SeveralIfaces().m2();

        new SeveralIfaces().m1();

        A.m2();
        System.out.println(A.message);
        B.m2();
    }
}
