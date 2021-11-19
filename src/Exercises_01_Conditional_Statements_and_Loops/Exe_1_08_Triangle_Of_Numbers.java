package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_08_Triangle_Of_Numbers {
    public static void main(String[] args) {
        //Напишете програма, която приема цяло число "n" и принтира триъгълник от числата от 1 до "n" .
        // Числото "n" ще е в интервала [1...20]

        Scanner scanner = new Scanner(System.in);
        int numberN = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= numberN ; row++) {
            for (int col = 0; col < row; col++) {
                System.out.printf("%d ", row);
            }
            System.out.println();
        }




    }
}
