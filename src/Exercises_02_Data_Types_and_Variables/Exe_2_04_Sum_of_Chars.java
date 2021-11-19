package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_04_Sum_of_Chars {
    public static void main(String[] args) {
        //Напишете програма, която сумира ASCII кодовете от n символа.
        //Отпечатайте сумата на конзолата.
        // На входа - • На първия ред ще получите n - броят на редовете, които ще последват.
        //• На следващите n реда - ще получите букви от латинската азбука .
        // • n ще бъде в интервала [1 ... 20].
        //• Символите винаги ще бъдат главни или малки букви от английската азбука.
        //• Винаги ще получавате по една буква на ред.

        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sunAscii = 0;

        while (numberOfLines > 0) {
            char currentSim = scanner.nextLine().charAt(0);
            int asciiNum = currentSim;
            sunAscii += asciiNum;

            numberOfLines--;
        }
        System.out.printf("The sum equals: %d%n", sunAscii);



    }
}
