package toughToVeryTough;

public class MathRoundAndString {

    public static int getSwitch(String arg) {
        return (int) Math.round(Double.parseDouble(arg.substring(1, arg.length() - 1)));    // Math.round (-0.5) == 0
    }

    public static void main (String... args) {
        int val = getSwitch("--0.50");
        switch (val) {
            case 0:
                System.out.print("Hello");
            case 1:
                System.out.print("World"); break;    // will go here because of "break" absence in case "0"
            default:
                System.out.print("Good Bye"); break;
        }
         // ---> "HelloWorld"
    }
}
