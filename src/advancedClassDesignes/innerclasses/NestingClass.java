package advancedClassDesignes.innerclasses;

public class NestingClass {
    public static void main(String... args) {
        B.C o = new B().new C();
    }
}

class A {
    char c;
    A(char c) {
        this.c = c;
    }

    void method() {
        System.out.println("Ha-ha");
    }
}

class B extends A {
    char c = 'a';
    B() {
        super('b');
    }

    class C extends A {
        char c = 'c';
        C() {
            super('d');
            System.out.println(B.this.c);
            System.out.println(C.this.c);
            System.out.println(super.c);
            System.out.println(B.super.c);
            String k;
            final String kOK = "OK";

            final class E {   // Could be used with 'final' and 'abstract'!!!
                E() {
                    System.out.println(c);
                    System.out.println(C.this);
                    System.out.println(B.C.this);

                    System.out.println(B.this);


                    System.out.println(B.super.c);
                    B.super.method();

//                    System.out.println(k); // will not compile, must be initialized, so if "final" then ok!
                    System.out.println(kOK);
                }
            }

            new E();
        }
    }
}

// result will be 'a' , 'c' , 'd', 'b'