package toughToVeryTough;

public class TernaryExpressionsAndMostConcreteMethodsCalling {

    public static void test(Object o) {
        System.out.println("o is Object");
    }

    public static void test(RuntimeException o) {
        System.out.println("o is RuntimeException");
    }

    public static void test(Exception o) {
        System.out.println("o is Exception");
    }

  /*
    // 1.
    public static void test(NullPointerException o) {
        System.out.println("o is NullPointerException");
    }

    // 2.
    public static void test(IndexOutOfBoundsException o) {
        System.out.println("o is IndexOutOfBoundsException");
    }


    In this case, line : " test(a < 2 ? null : null); " will cause the ambiguity of method call
  */

    public static void main(String[] args) {
        int a = 1;
        test(a < 2 ? null : new Object());
        test(a < 2 ? null : null);
        test(a < 2 ? new String() : new RuntimeException());
        test(a < 2 ? new Exception() : null);
    }
}
