package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_03_Characters_in_Range {
    public static void main(String[] args) {
        /* Напишете метод, който получава два знака и отпечатва на един ред всички знаци между тях
        *  в съотвествие с ASCII таблицата.
        * */
        Scanner scanner = new Scanner(System.in);
        char sim1 = scanner.nextLine().charAt(0);
        char sim2 = scanner.nextLine().charAt(0);

        printSimbolsBetweenTwoCharacters(sim1, sim2);




    }

    private static void printSimbolsBetweenTwoCharacters(char simbol1, char simbol2) {
        if (simbol1 < simbol2) {
            for (char currentChar = (char) (simbol1 + 1); currentChar < simbol2; currentChar++) {

                System.out.printf("%c ", currentChar);
            }
        } else {
            for (char currentChar = (char) (simbol2 + 1); currentChar < simbol1; currentChar++) {
                System.out.printf("%c ", currentChar);
            }
        }
    }
}
