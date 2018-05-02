package decisionConstructorsAndLoops;

public class ShadowingVariables {

    /**
     * Q: How many times will be printed?
     *
     *  1. It will not compile.
     *  2. It will print 1 2 3 4 5 five times.
     *  3. It will print 1 3 5 five times.
     *  4. It will print 1 2 3 4 5 six times.
     *  5. It will print 1 2 3 4 5 once.
     *
     *  A: 3
     */
    private static int j;
    public void test() {
        while (j <= 5) {
            for (int j = 1; j <= 5;) {      // variable j just shadowed
                System.out.println("Print j = " + j);
                j++;
            }
            j++;
        }
    }


    public void test2(int j){
        j = j = 5; //  just manipulations with static
        System.out.println("class var: " + ShadowingVariables.j + " local  var: " + j);
    }

    public void test3(int j) {
        //for (int j = 0; j <1; j++)   // Is already defined in this scope. in method "j" is the same scope as in loop
    }

    public static void main(String[] args) {
        new ShadowingVariables().test();
        new ShadowingVariables().test2(7);
    }


}
