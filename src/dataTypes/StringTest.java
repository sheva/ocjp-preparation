package dataTypes;

import java.util.Arrays;

public class StringTest {

    static String str = "abcdefab";
    static String nullStr;

    public static void main(String[] args)throws Exception{
        str.trim();
        System.out.println(isStringPalindrome("abcdcba"));
        System.out.println(isStringPalindrome("abcddcba"));
        System.out.println(isStringPalindrome("abcddcbda"));
        System.out.println(reverseStringWithArray("shevaya"));
        System.out.println(str.substring(3, 5));    // --> de
        System.out.println(str.substring(3));      // --> def
        System.out.println(str.subSequence(3, 5)); // --> de
        System.out.println(nullStr);               // --> null

        System.out.println(str.charAt('2')); // legal char can be implicitly promoted to int     '2' -> 50
        System.out.println(str.indexOf("ab", 4));

    }

    public static boolean isStringPalindrome(String str) {
        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String reverseStringWithArray(String str) {
        char[] arr = str.toCharArray(); char temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return String.valueOf(arr);
    }
}

