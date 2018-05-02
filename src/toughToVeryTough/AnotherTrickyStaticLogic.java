package toughToVeryTough;

public class AnotherTrickyStaticLogic {

    static AnotherTrickyStaticLogic ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new AnotherTrickyStaticLogic();
        ref.func(args);
    }

    public void func(String[] args) {
        ref.arguments = args;
    }
}
