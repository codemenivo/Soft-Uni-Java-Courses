package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_02_Division {
    public static void main(String[] args) {
        //Ще ви бъде дадено цяло число и трябва да отпечатате на конзолата дали това число се дели на следните
        // числа: 2, 3, 6, 7, 10. Отпечатайте най-големият делител на зададеното входно число. Ако числото се дели на
        //2 и на 3, то се дели и на 6 -> Отпечатайте само 6. Ако числото се дели на 2, понякога се дели и на 10 и
        // трябва да отпечатате делението на 10. Ако числото не се дели на нито едно от дадените числа, отпечатайте :
        // “Not divisible”. В противен случай отпечатайте -> "The number is divisible by {number}".

        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        //boolean flag = false;
        int divider = -1;

        if (inputNumber % 10 == 0) {
            //flag = true;
            divider = 10;
        } else if (inputNumber % 7 == 0) {
            //flag = true;
            divider = 7;
        } else if (inputNumber % 6 == 0) {
            //flag = true;
            divider = 6;
        } else if (inputNumber % 3 == 0) {
            //flag = true;
            divider = 3;
        } else if (inputNumber % 2 == 0) {
            //flag = true;
            divider = 2;
        } else {
            System.out.println("Not divisible");
        }
        if (divider != -1) {
            System.out.printf("The number is divisible by %d%n", divider);
        }




    }
}
