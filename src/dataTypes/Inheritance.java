package dataTypes;

class Super2 {
    private int a;
    Super2(int a) {this.a = a;}
    Super2(){}
}

public class Inheritance {

    class Super {
        private int a;
        Super(int a) {this.a = a;}
        Super(){}
    }

    class Sub extends Super {
        public Sub(int a) {super(a);}
        //public Sub() {this.a = 5;}   // Is ok!!! in one inner class
    }


    class Sub2 extends Super2 {
        public Sub2(int a) {super(a);}
        // public Sub2() {this.a = 5;} Will not compile: private access
    }
}


class A {


    static  class B {
        private B() {}
    }

    static class C extends B {
        public C () {}
    }

    public static void main(String[] args) {
        new C();
        throw new IndexOutOfBoundsException();
    }
}
