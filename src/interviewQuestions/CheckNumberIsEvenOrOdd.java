package interviewQuestions;

import java.util.Scanner;

public class CheckNumberIsEvenOrOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check for parity");
        int num = input.nextInt();
        System.out.println(String.format("Number %d is " + ((num % 2 == 0) ? "even" : "odd"), num));
    }


/*
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nothing to check. Please, enter some number!");
            return;
        }

        int num = Integer.parseInt(args[0]);
        System.out.println(String.format("Number %d is " + (num %2 == 0 ? "even" : "odd"), num));
    }
    */

}
