package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_12_Even_Number {
    public static void main(String[] args) {
        //На входа получавате число. Ако числото е четно принтирате като изход абсолючната стойност на това чосло във
        // формат The number is: {even number} , ако числото е нечетно да се принтира съобщение :
        // print "Please write an even number."  и да се продължи с въвеждането на следващо число.

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

            while (inputNumber % 2 != 0) {
                System.out.println("Please write an even number.");

                inputNumber = scanner.nextInt();
            }
        System.out.printf("The number is: %d%n", Math.abs(inputNumber));


    }
}
