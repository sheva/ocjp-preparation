package toughToVeryTough;
/**
 * Question? What 2 lines of code are wrong?
 *
 *
 * Answer! 3(explicit cast to float is needed) & 5 ("do" is reserved word)
 */
import java.*;               //1

public abstract class JavaTrickyEverywhere { //2
//  float density = 23.34; //3
    public class Doer{        //4
//     void do(){               //5
            //some logic
//     }
    }
}
