package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_11_Math_Operations {
    public static void main(String[] args) {

        /* Напишете метод, който изчислява резултата от математическа операция между две числа. Входните данни
        *  ще постъпват на три реда. На ред 1 -> Първото число, на вторият ред знака на математическата операция.
        *  На последният ред -> второто число. Възможните математически операции са: / * + -  .
        *  Отпечатайте резултата - цяло число, закръглено нагоре. (Print the result rounded up to the second
        *  decimal point.)
        * */

        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        char mathOperation = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = getResultCalculation(firstNum, mathOperation, secondNum);
        System.out.printf("%.0f%n", result);


    }

    private static double getResultCalculation(int num1, char operation, int num2) {

        double mathRes = 0.0;

        switch (operation) {

            case '+':
                mathRes = getSum(num1, operation, num2);
                break;
            case '-':
                mathRes = getSubtract(num1, operation, num2);
                break;
            case '*':
                mathRes = getMultiply(num1, operation, num2);
                break;
            case '/':
                mathRes = getDivide(num1, operation, num2);
                break;
        }
        return mathRes;
    }

    private static double getDivide(int num1, char operation, int num2) {
        return num1 * 1.00 / num2;
    }

    private static double getMultiply(int num1, char operation, int num2) {

        return num1 * num2;
    }

    private static double getSubtract(int num1, char operation, int num2) {

        return num1 - num2;
    }

    private static double getSum(int num1, char operation, int num2) {
        
        return num1 + num2;
    }
}
