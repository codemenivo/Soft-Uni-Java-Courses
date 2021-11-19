package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_11_Multiplication_Table_2 {
    public static void main(String[] args) {
        //Преработете предната задача Lab_10, като от конзолата ще получавате едно число и  за това цяло число
        // принтирайте резултата от умножението от това число с подаденото цяло число на втори ред до числото 10
        // включително. Ако второто число е по-голямо от 10 , резултата де е от един ред включваш умножението на
        // първото и второто вховни числи. Резултатите да се запишат на всеки ред във формат :
        //  {theInteger} X {times} = {product} . Входното число е [1...100]

        Scanner scanner = new Scanner(System.in);
        int multiplier1 = Integer.parseInt(scanner.nextLine());
        int multiplier2 = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (multiplier2 > 10) {
            result = multiplier1 * multiplier2;
            System.out.printf("%d X %d = %d%n", multiplier1, multiplier2, result);
        } else
        for (int i = multiplier2; i <= 10 ; i++) {
            result = multiplier1 * i;
            System.out.printf("%d X %d = %d%n", multiplier1, i, result);
        }




    }
}
