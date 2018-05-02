package advancedClassDesignes.interfaces;

public class Interfaces {
    interface A {
        // OK!
        default void m1() {
            System.out.println("A::m1");
        }

        static void m2() {
            System.out.println("A::m2");
        }

        static void m3() {
            System.out.println("A::m3");
        }

        // WRONG!
//        final void m3();  // Can never be declared final
    }


}

class TestSuper implements Interfaces.A {
    public void m1() {
        System.out.println("TestSuper::m1");
// OK!
        Interfaces.A.super.m1();
    }
}

class TestA extends TestSuper {
    // OK!
    public void m1() {
        System.out.println("TestA::m1");
        // OK!!!
        super.m1();
    }

    // OK!
    public void m2() {
        System.out.println("TestA::m2");
    }

    public static void m3() {
        System.out.println("TestA::m3");
    }

    public static void main(String... args) throws Exception {
        TestA a = new TestA();
        a.m1();
        a.m2();
        a.m3();

        ((Interfaces.A)a).m1();
        ((TestSuper)a.getClass().getSuperclass().newInstance()).m1();
        a.getClass().getSuperclass().getInterfaces()[0].getDeclaredMethod("m1").invoke(a.getClass().getSuperclass().newInstance());
// IMPOSSIBLE "is not an enclosing class
        //        Interfaces.A.super.m1()
// IMPOSSIBLE cannot be done via static content "public static void main"
//        super.m1();

        // WRONG!
//        ((Interfaces.A)a).m2();
//        ((Interfaces.A)a).m3();

        // OK!! (instead)
        Interfaces.A.m2();
        Interfaces.A.m3();
    }
}
