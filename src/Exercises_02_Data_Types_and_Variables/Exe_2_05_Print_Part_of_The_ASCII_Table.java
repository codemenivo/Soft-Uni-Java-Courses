package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_05_Print_Part_of_The_ASCII_Table {
    public static void main(String[] args) {
        //Напишетепрограма, която принтира част от ASCII table на конзолата. На първият ред на входа, ще получите
        // стартовият индекс на ASCII кода, от който трябва да започне, а на вторият ре ще получите крайната стойност,
        // до която трябва да се принтират символите.

        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= endNum ; i++) {
            char simbol = (char) i;
            System.out.printf("%c ", simbol);
        }




    }
}
