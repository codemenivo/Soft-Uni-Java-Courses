package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_07_Reversed_Chars {
    public static void main(String[] args) {
        //На три последователни реда на входа ще получавате по един символ. Напишете програма, която прочита тези
        // символи и ги принтира в обратен ред, като ги изписвате на един ред с интервал между тях.

        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c%n", ch3, ch2, ch1);


    }
}
