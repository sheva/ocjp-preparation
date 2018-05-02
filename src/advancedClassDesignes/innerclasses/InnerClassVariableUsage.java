package advancedClassDesignes.innerclasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Q: What will happen when you attempt to compile and run the program?
 *
 * O:   1. It will not compile;
 *      2. It will compile, but not show anything when run;
 *      3. It will compile and show very small frame;
 *      4. It will compile and show a frame big enough to show the button;
 *      5. None of the above.
 *
 *  A:  1. It will not compile, because a variable 's' is not accessible from inner class.
 *
 */
public class InnerClassVariableUsage extends Frame {
    String s = "Message";

    public void someNonStatic() {
        InnerClassVariableUsage test = new InnerClassVariableUsage();
        Button b = new Button("press me");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Message is " + s);  // Works ok!
            }
        });
    }

    public static void main(String[] args) {
        InnerClassVariableUsage test = new InnerClassVariableUsage();
        Button b = new Button("press me");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Message is " + s);  Compilation error!!! because 's' is not static (if it will then compilation succeed)
            }
        });
        test.add(b);
//        test.setVisible(true);  Show up the frame but very small, button is not visible
    }
}
