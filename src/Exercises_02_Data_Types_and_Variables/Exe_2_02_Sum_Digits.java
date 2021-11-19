package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_02_Sum_Digits {
    public static void main(String[] args) {
        //Ще получавате по едно цяло число. Задачата е да намерите сумата от техните цифри.

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = input.length();
        int sum = 0;

        for (int i = 0; i < size; i++) {
            char currentSimbol = input.charAt(i);
            int digi = Character.digit(currentSimbol, 10);
            sum += digi;
        }
        System.out.printf("%d%n", sum);

    }
}
