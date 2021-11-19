package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_08_Divisible_by_3 {
    public static void main(String[] args) {
        //Напишете програма, която изписва всички числа от 1 до 100, които се делят на 3 без остатък.

        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 100 ; i += 3) {
            System.out.printf("%d%n", i);
        }




    }
}
