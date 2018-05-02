package toughToVeryTough;
/**
 * Q: Given the code. which of the changes should be done independently to successfully compile and run this code?
 *
 * A) insert after line 2: else local = "bad";
 * B) insert after line 2: if (n<=0 ) local = "bad";
 * C) move line //1 after line //0
 * D) change line 1 to final String local = "rocky";
 * E) the program is already ok
 *
 * A: A) & C)
 */

public class SomeClass1 {
    String s1 = "green mile"; // 0

    public void generateReport( int n) {
        String local;  // 1
        if (n > 0 ) local = "good";  // 2
  //      System.out.println(s1 + "=" + local);
    }
}
