package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_03_Zig_Zag_Arrays {
    public static void main(String[] args) {
        /* Наспишете програма, която създава два масива. На първият ред на входа ще получите цяло число n.
        *  На следващите n реда получавате 2 цели числа. Формирайте масиви 2, както е показано по-долу.
        * От първи ред Първо число в първи масив, Второ число във втори масив. Втори ред -> Първо число във втори масив
        * Второ число в първи и така се разменят за всичките n реда.
        * */

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[num];
        String[] secondArr = new String[num];

        for (int row = 1; row <= num; row++) {

                String[] input = scanner.nextLine().split("\\s+");
                if (row % 2 != 0) {
                    firstArr[row - 1] = input[0];
                    secondArr[row -1] = input[1];
                } else {
                    firstArr[row - 1] = input[1];
                    secondArr[row - 1] = input[0];
                }


        }


        for (String number : firstArr) {
            System.out.printf("%s ", number);
        }
        System.out.println();
        for (String digit : secondArr) {
            System.out.printf("%s ", digit);
        }


    }
}
