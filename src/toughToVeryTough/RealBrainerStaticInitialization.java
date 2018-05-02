package toughToVeryTough;

class Super {
    static int LOG = 1;

}

class Sub extends Super {
    static {
        System.out.println("In Sub");
    }
}

public class RealBrainerStaticInitialization {

    public static void main(String[] args) {
        System.out.println(Sub.LOG);         // Print out : 1 And no "In Sub" printed at all
    }
}
