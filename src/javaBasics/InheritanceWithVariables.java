package javaBasics;

abstract class AA {
    public int i = 1;
    private int j = 2;

    public AA() {}

    public void method() throws Exception {}
    public void m2(){};
}

abstract class BB extends AA {
//    private int i = 3;
    public int k = 4;

    public abstract void method();

  //  public static void m2(){}; Illegal to make it "static"
}

class CC extends BB {
    public void method() {};
}

public class InheritanceWithVariables {

    public static void main(String... args) {
        CC cc = new CC();
       // System.out.println(cc.i); Compilation error
       // System.out.println(cc.j); Compilation error
        System.out.println(cc.k);

        AA aa = cc;
      //  aa.method(); Unhandled Exception because of method signature "public void method() throws Exception {}"

        ((CC)aa).method();  // OK!
    }
}
