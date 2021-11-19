package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_01_Smallest_of_Three_Numbers {
    public static void main(String[] args) {
        /* Напишете метод, който принтира най- малкото от три цели числа.
        *  Използвайте подходящо име за метода.
        * */

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printMinNumber(num1, num2, num3);



    }

    private static void printMinNumber(int num1, int num2, int num3) {
        int minNum = Math.min(num1, num2);
        if (num3 < minNum) {
            minNum = num3;
        }
        System.out.printf("%d%n", minNum);
    }
}
