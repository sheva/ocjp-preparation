package toughToVeryTough;


/**
 * Question? what can be placed in line 1 in order to print "x"
 *
 * 1) c = c;
 * 2) c = this.a;
 * 3) c = "" + AccessTest.b;
 * 4) c = AccessTest.this.a;
 * 5) c = "" + b;
 *
 * Answer!  3,4,5
 */
public class AccessTest {
    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner  {
        String a = "y";
        String get (){
            String c = "temp";
            // Line 1
            return c;
        }
    }

    AccessTest(){
        System.out.println(new Inner().get());
    }

    public static void main(Object[] args) {
        new AccessTest();
    }
}
