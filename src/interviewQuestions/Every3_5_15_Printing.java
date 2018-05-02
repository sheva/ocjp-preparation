package interviewQuestions;

public class Every3_5_15_Printing {

/*
    Write a method printing out 1-100 were every multiple of 3 print out "Fizz" instead of the number,
    for every multiple of 5 print out "Buzz" instead of the number,
    and every multiple of 15 print out "Fizz Buzz" instead of the number.

    */

    public static void main(String... args) {
        for (int i = 1; i<= 1000; i++) {
            System.out.print(" i = " + i + " ");
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else  {
                System.out.println(i);
            }
        }
    }
}
