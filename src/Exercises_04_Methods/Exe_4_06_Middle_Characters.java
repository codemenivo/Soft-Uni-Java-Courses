package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_06_Middle_Characters {
    public static void main(String[] args) {
        /* Като вход ще получите еденичен стринг. Напишете метод, който принтира средният символ. Ако дължината на
        *  стринга е нечетна, то тогава имаме два средни символа.
        * */

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleChar(text);




    }

    private static void printMiddleChar(String inputText) {
        int indexChar = inputText.length() / 2;

        if (inputText.length() % 2 != 0) {
            char midChar = inputText.charAt(indexChar);
            System.out.printf("%c%n", midChar);

        } else {
            System.out.printf("%c%c%n", inputText.charAt(indexChar - 1), inputText.charAt(indexChar));
        }
    }
}
