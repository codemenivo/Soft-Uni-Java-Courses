package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_06_Chars_To_String {
    public static void main(String[] args) {
        //Напишете програма, която чете три линии от входа. На всеки ред ще получавате еденичен символ.
        // Комбинирайте всички символи в един стринг и го принтирайте на конзолата.

        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c%n", ch1, ch2, ch3);




    }
}
