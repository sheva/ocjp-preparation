package codefights;

import java.util.*;

/**
 * Given a string of digits, return all of the possible non-empty letter combinations that the number could represent.
 * The mapping of digits to letters is the same as you would find on a telephone's buttons, as in the example below:
 *
 * The resulting array should be sorted lexicographically.
 *
 * Example:
 *
 * For buttons = "42", the output should be
 * pressingButtons(buttons) = ["ga", "gb", "gc", "ha", "hb", "hc", "ia", "ib", "ic"].
 *
 * Input/Output
 *
 * [execution time limit] 3 seconds (java)
 * [input] string buttons
 *
 * A string composed of digits ranging from '2' to '9'.
 *
 * Guaranteed constraints:
 *
 * 0 ≤ buttons.length ≤ 7.
 *
 * [output] array.string
 *
 *
 *
 * Created by Sheva on 3/21/2018.
 */
public class Some {

    static String[] pressingButtons(String buttons) {
        List<String> result = new ArrayList<>();
        int size = 0, digitPos = 1;
        for (char digit : buttons.toCharArray()) {
            int i = 0, startIndex = 0;
            for (char c : digitToLetters.get(digit)) {
                if (digitPos > 1) {
                    for (int j = startIndex; j < (i+1)*size; j++) {
                        if (startIndex < size) {
                            result.set(j, result.get(j - i*size) + c);
                        } else {
                            result.add(result.get(j - i*size).replaceFirst(".$","") + c); // trim to previous iteration
                        }
                    }
                    startIndex = (i+1)*size;
                } else {
                    result.add(Character.toString(c));
                }
                i++;
            }
            size = (digitPos == 1) ? i : i*size;
            digitPos++;
        }
        Collections.sort(result); // to be compliant with Test Case #1
        return result.toArray(new String[result.size()]);
    }

    static Map<Character, Character[]> digitToLetters = new HashMap<Character, Character[]>() {{
        put('2', new Character[]{'a', 'b', 'c'});
        put('3', new Character[]{'d', 'e', 'f'});
        put('4', new Character[]{'g', 'h', 'i'});
        put('5', new Character[]{'j', 'k', 'l'});
        put('6', new Character[]{'m', 'n', 'o'});
        put('7', new Character[]{'p', 'q', 'r', 's'});
        put('8', new Character[]{'t', 'u', 'v'});
        put('9', new Character[]{'w', 'x', 'y', 'z'});
    }};

    public static void main(String... args) {
        pressingButtons("234");
    }
}
