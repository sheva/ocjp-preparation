package interviewQuestions;

public class IsStringPalindrome {

    public static void main(String... args) {
        isPalindrome("sheva");
        isPalindrome("asa");
        isPalindrome("asads");
        isPalindrome("asdsa");
        isPalindrome("asddsa");
        isPalindrome("asdyhjkydsa");
        isPalindrome("asdyydsa");

        isPalindrome2("sheva");
        isPalindrome2("asa");
        isPalindrome2("asads");
        isPalindrome2("asdsa");
        isPalindrome2("asddsa");
        isPalindrome2("asdyhjkydsa");
        isPalindrome2("asdyydsa");
    }

    private static void isPalindrome(String test) {
        if (test == null) {
            System.out.println("String is null");
            return;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < test.length()/2; i++) {
            if (test.charAt(i) != test.charAt(test.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        printIsPalindromeResult(test, isPalindrome);
    }

    private static void isPalindrome2(String test) {
        boolean isPalindrome = new StringBuilder(test).reverse().toString().compareTo(test) == 0;
        printIsPalindromeResult(test, isPalindrome);
    }

    private static void printIsPalindromeResult(String test, boolean isPalindrome) {
        System.out.println(String.format("String %s is palindrome - %b", test, isPalindrome));
    }
}
