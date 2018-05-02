package advancedClassDesignes.innerclasses;

class D {
    void m() {
        System.out.println("outer");
    }
}

public class TrickyInnerOuterLocalClasses {

    public static void main(String[] args) {
        new TrickyInnerOuterLocalClasses().go();
    }

    void go() {
        new D().m();
        class D {
            void m() {
                System.out.println("inner");
            }
        }
    }

    class D {
        void m() {
            System.out.println("middle");
        }
    }

    // WILL PRINT "middle", however if remove inner class D then "outer" will be printed.
}
