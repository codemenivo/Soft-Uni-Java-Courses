package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_05_Add_and_Subtract {
    public static void main(String[] args) {
        /* Като вход на отделни редове ще получите три цели числа. Напишете метод за сумиране (sum) на първите две цели
        *  числа и метод за изваждане (subtract), който дава разликата между резултата от метода за сумиране и
        * третото цяло число. На изхода отпечатайте крайният резултат.
        * */

        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        resultMathOperation(firstNum, secondNum, thirdNum);



    }

    private static void resultMathOperation(int firstNum, int secondNum, int thirdNum) {
        int result = findSubtractIntegers(firstNum, secondNum, thirdNum);
        System.out.printf("%d%n", result);

    }

    private static int findSubtractIntegers(int firstNum, int secondNum, int thirdNum) {
        return findSumTwoIntegers(firstNum, secondNum) - thirdNum;

    }

    private static int findSumTwoIntegers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
