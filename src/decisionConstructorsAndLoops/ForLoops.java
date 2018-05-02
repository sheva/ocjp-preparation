package decisionConstructorsAndLoops;

public class ForLoops {

    public static void test1() {
        int i, j;

        for( i=0,j=0; j<1; ++i,j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("i = " + i + ", j = " + j);
        // ---> output "i = 0, j = 0; i = 1, j = 1"
    }

    public static void test2() {
        int i,j;

        for( i=0,j=0; j<0; ++i,j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("i = " + i + ", j = " + j);
        // ---> output "i = 0, j = 0; "
    }

    public static void test3() {
        int i,j;

        for( i=0,j=0; j<i; ++j,i++) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("i = " + i + ", j = " + j);
        // ---> output "i = 0, j = 0; "
    }

    public static void test4(){
        for (;;){    // Infinite loop, but valid construction. Result - StackOverflowException
            System.out.println("sheva");
        }
    }

    public static void main(String... args) {
        test1();
        test2();
        test3();
        test4();
    }
}
