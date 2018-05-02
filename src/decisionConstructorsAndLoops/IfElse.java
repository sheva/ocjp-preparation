package decisionConstructorsAndLoops;

public class IfElse {

    public static void main(String [] args) {
        boolean flag = true;
        if (flag = false) {
            System.out.println("1");
        } else if (flag) {
            System.out.println("2");
        } else if (!flag) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        test();
    }

    public static int test() {

        boolean flag = true;
        if (flag = false) {
            return 1;
        } else if (flag) {
            return 2;
        } else if (!flag) {
            return 3;
        } else {
            return 4;
        }
        //return 0;   Unreachable statement
    }

    public static void validConstruction() {

        for (;;) {
            break;
        }

        switch(1) {
            default: break;
        }

        switch(1) {
        }

        for (;;) {

        }

        // return;  Unreachable statement due to infinite loop
    }
}
