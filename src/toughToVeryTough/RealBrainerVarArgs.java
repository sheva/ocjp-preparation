package toughToVeryTough;

/***
 * Question? What will be the result
 *
 *      1. "1"
 *      2. "2"
 *      3. "3"
 *      4. Compilation failure
 *
 *  Answers! --- "3"
 *
 */
public class RealBrainerVarArgs {

    public void test(){
        test1(1,1);
    }

    public void test1(int i, int... j){
        System.out.println("1");
    }

    public void test1(int... i) {
        System.out.println("2");
    }

    public void test1(int i, int j) {
        System.out.println("3");
    }


    public static final void main(String[] args) {
        new RealBrainerVarArgs().test();
    }
}
