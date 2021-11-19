package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_07_Max_Sequence_Of_Equal_Elements {
    public static void main(String[] args) {
        /* Напишете програма, която намира най-дългата последователност от равни елементи в масив от цели числа.
        *  Ако съществуват няколко най-дълги последователности, отпечатайте най-лявата.
        * */

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int maxCounter = 1;
        int currentCounter = 1;
        String printElement = "";

        if (input.length == 1) {
            System.out.printf("%s%n", input[0]);
        } else {
            for (int index = 0; index < input.length - 1; index++) {
                String firstElement = input[index];
                String secondElement = input[index + 1];


                if (firstElement.equals(secondElement)) {
                    currentCounter++;
                    if (index + 1 == input.length - 1 && currentCounter > maxCounter) {
                        maxCounter = currentCounter;
                        currentCounter = 1;
                        printElement = firstElement;
                    }
                } else if (currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                    currentCounter = 1;
                    printElement = firstElement;
                } else if (currentCounter <= maxCounter) {
                    currentCounter = 1;
                }

            }
            for (int printIndex = 1; printIndex <= maxCounter; printIndex++) {
                System.out.printf("%s ", printElement);
            }
            System.out.println();
        }

    }
}
