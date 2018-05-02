package interviewQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandManGame {

    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Please enter some string");
            return;
        }
        String original = args[0];

        StringBuilder guessStr = new StringBuilder(original.length());
        propagateGuessStr(original, guessStr);

        System.out.println("Lets play! :) Try to guess a word. " + guessStr.toString());

        int gameOverCounter = 0, maxAttempts = 6;

        do {
            try {
                System.out.print("Enter one letter: ");
                Scanner scanner = new Scanner(System.in);
                String taken = scanner.next("[a-zA-Z]");

                boolean found = false;
                for (int i = 0; i < original.length(); i++) {
                    if (original.charAt(i) == taken.charAt(0)) {
                        guessStr.replace(i, i + 1, taken);
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Cool! You are right. This letter is present. Guested string " + guessStr);
                } else {
                    gameOverCounter++;
                    System.out.println("You are wrong. Try another letter. Attempts remain: " + (maxAttempts - gameOverCounter));
                }

            } catch (InputMismatchException e) {
                System.out.println("Try on more time. Enter one letter that is present in the word");
            }
        } while (gameOverCounter < maxAttempts && original.compareTo(guessStr.toString()) != 0);


        if (gameOverCounter == maxAttempts) {
            System.out.println("Game over. You are lost this game.");
        } else {
            System.out.println("Congratulations! You are the best!");
        }
    }

    private static void propagateGuessStr(String original, StringBuilder guessStr) {
        for (int i = 0; i < original.length(); i++) {
            if (i == 0 || i == original.length() - 1) {
                guessStr.append(original.charAt(i));
            } else {
                guessStr.append("_");
            }
        }
    }
}
