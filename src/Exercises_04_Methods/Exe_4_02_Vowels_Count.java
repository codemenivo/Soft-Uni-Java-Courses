package Exercises_04_Methods;

import java.util.Locale;
import java.util.Scanner;

public class Exe_4_02_Vowels_Count {
    public static void main(String[] args) {
        /* Напишете метод, който получава еденичен стринг и принтира броят на гласните букви съдържащи се в него.
        *  Използвайте подходящо име за метода.
        * */

        Scanner scanner = new Scanner(System.in);
        printNumVowels(scanner.nextLine());



    }

    private static void printNumVowels(String input) {
        input = input.toLowerCase();
        int length = input.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            char sim = input.charAt(i);
            switch (sim) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    counter++;
                    break;
            }
        }
        System.out.printf("%d%n", counter);
    }
}
