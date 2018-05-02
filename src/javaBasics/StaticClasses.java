package javaBasics;

class A {

    private static class NestedPrivateClass {
    }

    protected static class NestedProtectedClass {
        int a;
    }

    public static class NestedPublicClass {
        public static class SomeStatic {
            class B {

            }
        }
    }

}


public class StaticClasses {
    A.NestedProtectedClass NestedProtected = new A.NestedProtectedClass();
//    A.NestedPublicClass.SomeStatic.B b = new A.NestedPublicClass.SomeStatic.B();
}
