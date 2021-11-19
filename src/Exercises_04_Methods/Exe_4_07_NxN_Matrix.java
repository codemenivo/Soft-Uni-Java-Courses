package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_07_NxN_Matrix {
    public static void main(String[] args) {
        /* Напишете метод, който на входа получава едно цяло число "n" и принтира матрица "nxn", на която елементите ѝ
        *  са даденото число.
        * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printMatrixNxN(number);



    }

    private static void printMatrixNxN(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }
}
