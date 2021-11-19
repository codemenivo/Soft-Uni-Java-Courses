package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_06_Triples_of_Latin_Letters {
    public static void main(String[] args) {
        //Напишете програма, която прочита от входа цяло число "n" и отпечатайте всички тройки от първите "n" малки
        // латински букви, подредени по азбучен ред .

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                for (int k = 0; k < input; k++) {
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }




    }
}
