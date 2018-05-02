package toughToVeryTough;

public class StringComparisonTricky {

    public static void main (String... args) {
        String initial = "good";

        char[] charArr = {'g','o', 'o', 'd'};
        String newStr = null;       // !!!!!
        for (int i = 0; i < charArr.length ; i++) {
            newStr += charArr[i];
        }

        System.out.println((newStr == initial) + " " + initial.equals(newStr)); // false false ( newStr = "nullgood")
    }
}
