package advancedClassDesignes.innerclasses;

public class AnonymousClasses {

    private static String a = "outer static ";
    private String b = "outer variable ";

    class Pop {
        Pop() {
            m();
        }

        void m() {
            System.out.println("in Pop");
        }
    }

    public void someMethod() {
        new Pop();   // Is Ok!
    }

    public void regularInnerClass() {
        Pop p = new Pop() {  // an instance of anonymous (unnamed) subclass of Pop, not an INSTANCE of Pop!
        }; // ATTENTION: NOt forget about semicolon at the end

        // OR:

        p = new Pop() {
            void m() {
                System.out.println("In Anonymous class");
                anotherMethodNotFromPop();
            }

            void anotherMethodNotFromPop() {
                System.out.println(AnonymousClasses.a + AnonymousClasses.this.b);

                // OR

                System.out.println(AnonymousClasses.this.a + AnonymousClasses.this.b);;
            }
        };

        // OR:
        new Pop() {
            void m() {
                System.out.println("In Anonymous class");
                anotherMethodNotFromPop();
            }

            void anotherMethodNotFromPop() {
                System.out.println(AnonymousClasses.a + AnonymousClasses.this.b);

                // OR

                System.out.println(AnonymousClasses.this.a + AnonymousClasses.this.b);;
            }
        }.anotherMethodNotFromPop();

//        p.anotherMethodNotFromPop(); Impossible to call, not in Pop declaration
        p.m();
    }

    public static void main(String[] args) {

        new AnonymousClasses().regularInnerClass();

        localInnerAnonymous();
        anonymousClassFromIface();
        anonymousAsArgument();

        AnonymousClasses.NestedClass nestedClass = new AnonymousClasses.NestedClass();
        int i = 5;
        nestedClass.m(i);

        System.out.println(NestedClass.staticVar);
        System.out.println(nestedClass.staticVar);
    }

    static class NestedClass {
        static String staticVar = "staticNested";
        String c = "nested";
        void m(int i) {
            System.out.println("In Nested class + " + c);
            System.out.println("Variable of method: " + i);
            System.out.println("Variable of outer class: " + a);
        }
    }

    private static void localInnerAnonymous() {

        abstract class InnerLocal {
            abstract void m();
        }

        InnerLocal l = new InnerLocal() {
            @Override
            void m() {
                System.out.println("Method m" + a);
            }

            void k() {
                System.out.printf("Method k");
            }
        };

        l.m(); //OK!!!
//        l.k(); // Illegal, cause InnerLocal does not have method k()
    }

    interface Cookable {
        void cook();
    }

    private static void anonymousClassFromIface() {
        new Cookable() {
            @Override
            public void cook() {
                System.out.println("I cook");
            }
            void anotherMethodNotFromPop() {

            }
        }.cook();

        // Could be replaced in Java 8 with lambda
        Cookable c = () -> System.out.println("I cook");

        // But not: ('not a statement')
//        () -> System.out.println("I cook");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run....");
            }
        };
        // Or
        r = () -> System.out.println("Run");

        // But not:
//        Runnable r = new Runnable();

        new Thread(r).start();
    }

    private static void anonymousAsArgument() {
        cooking(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking has started");
            }
        });

        // OR:
        cooking(() -> System.out.println("Cooking has started :2"));
    }

    private static void cooking(Cookable c) {
        c.cook();
    }
}

class Outside {
    public static void main(String[] args) {
        new AnonymousClasses().new Pop();

        // OR:

        AnonymousClasses classes = new AnonymousClasses();
        classes.new Pop();
    }
}
