package toughToVeryTough;

/**
 * Question?    What can be done to compile this code and run?
 *
 * Answers: 1) remove lines 3,6
 *          2) remove lines 5
 *          3) remove lines 5,6
 *          4) remove lines 7
 *          5) remove lines 3,7
 */
public class ReturnWhenExceptionsThrown {

    public static float parseFloat( String floatStr){
        float f = 0.0f;   // 1
        try {
            f = Float.valueOf(floatStr).floatValue();  //2
            return f;                                  //3

        } catch (NumberFormatException e) {
            f = Float.NaN;  //4
            return f;       //5
        } finally {
            return f;       //6
        }
        //return f; //7  / Unreachabel statement!
    }
}
