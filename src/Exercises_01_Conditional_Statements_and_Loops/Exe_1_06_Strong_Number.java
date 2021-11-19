package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_06_Strong_Number {
    public static void main(String[] args) {
        //Напишете програма, която проверява дали дадените числа са "strong number" или не са.
        // Числото е "strong number"  ако сумата от факториелите на всяка цифра от числото е равна на самото число.
        // Пример - 145 е "strong number" защото 1! + 4! + 5! = 145 . Принтирайте "yes" ако числото е "strong number"
        // или "no" ако не е.

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int startNum = inputNumber;

        while (startNum != 0) {
            int lastDigit = startNum % 10;
            int factorial = 1;
            if (lastDigit == 0 || lastDigit == 1) {
                sum += factorial;
            } else {
                for (int i = lastDigit; i > 1; i--) {
                    factorial *= i;
                }
                sum += factorial;
            }


            startNum /= 10;
        }
        if (inputNumber == sum) {
            System.out.printf("yes%n");
        } else {
            System.out.println("no");
        }



    }
}
