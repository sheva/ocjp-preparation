package decisionConstructorsAndLoops;

/**
 * Question? What letters will be printed, choose 2:
 *
 *  A: 1. A
 *     2. B
 *     3. C
 *     4. D
 *     5. F
 *
 *     Answer: "C", "E", "F"     (so 3. + 5. )
 */
public class ForSwitch {

    public static void main(String[] args) {
        char i;
        LOOP: for (i = 0; i < 5 ; i++) {
            switch(i++) {
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E': System.out.println("F");
            }
        }
    }
}
