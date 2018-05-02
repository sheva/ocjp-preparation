package advancedClassDesignes;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    protected void m() throws IOException {}
}
class Child extends Parent {
    public void m() throws FileNotFoundException  {}
}
public class AmbiguityClass {

    static void print(Child c, Parent p) {
        System.out.println("child" + "parent");
    }

    static void print(Parent p, Child c) {
        System.out.println("parent" + "child");
    }

    public static void main(String... args) {
//        print(new Parent(), new Parent());   // cannot resolve method

/*      print(new Child(), new Child());
 ambiguous call !! to calls are applicable, neither is more specific than the other.
to fix this add more concrete print(Child c1, Child c2)*/

        print(new Child(), new Parent());
        print(new Parent(), new Child());
    }
}
