package interviewQuestions;

public class CheckIfStringContainDuplicationSymbols {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please, insert something to test.");
            return;
        }

        String str = args[0];

        boolean res = false;
/*        for (int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == check) {
                    res = true;
                    break;
                }
            }
            if (res) break;
        }*/

        sheva: for (int i = 0; i < str.length(); i++) {
            char check = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == check) {
                    res = true;
                    break sheva;
                }
            }
        }
        System.out.println(String.format("String '%s' contains duplications %b", str, res));
    }
}
