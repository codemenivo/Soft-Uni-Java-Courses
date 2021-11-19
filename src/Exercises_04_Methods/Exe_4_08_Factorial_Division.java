package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_08_Factorial_Division {
    public static void main(String[] args) {

        /* Прочетете две цели числа. Изчислете факториела на всяко едно от тях. Разделете първият резултат на вторият и
        *  отпечатайте резултата от делението до еторият десетичен знак.
        * */

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        printDivisionTwoFactorials(num1, num2);



    }

    private static void printDivisionTwoFactorials(int num1, int num2) {
        double result = calculateFactorial_1(num1) * 1.0 / calculateFactorial_2(num2);
        System.out.printf("%.2f%n", result);
    }

    private static long calculateFactorial_2(int num2) {
        long factorialTwo = 1;
        for (int i = 2; i <= num2; i++) {
            factorialTwo *= i;
        }
        return factorialTwo;
    }

    private static long calculateFactorial_1(int num1) {
        long factorialOne = 1;
        for (int i = 2; i <= num1; i++) {
            factorialOne *= i;
        }
        return factorialOne;
    }
}
