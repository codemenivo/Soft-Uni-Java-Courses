package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_10_Multiplication_Table {
    public static void main(String[] args) {
        //На входа ще получите цяло число. Принтирайте на всеки ред резултата от умножението на това число с числата
        // от 1 до 10 включително. Изхода да е във формат {theInteger} X {times} = {product}. Входното число може да
        // заема стойности от [1...100].

        Scanner scanner = new Scanner(System.in);
        int multiplier = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            result = multiplier * i;
            System.out.printf("%d X %d = %d%n", multiplier, i, result);
        }




    }
}
