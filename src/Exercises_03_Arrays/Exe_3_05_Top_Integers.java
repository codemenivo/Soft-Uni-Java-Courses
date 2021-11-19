package Exercises_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_3_05_Top_Integers {
    public static void main(String[] args) {
        /* Напишете програма, за да намерите всички най-големи цели числа в масив.
        *  Най-голямо цяло число е цяло число, което е по-голямо от всички елементи вдясно. Последното число в масива,
        *  след което няма други елементи също е най-голямо число. Отпечатайте резултата на един ред,
        *  като разделите числата с интервал.
        * */

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();


        for (int num = 0; num < numbersArr.length; num++) {
            boolean flag = true;
            if (num == numbersArr.length - 1) {
                System.out.printf("%d%n", numbersArr[numbersArr.length - 1]);
            } else {
                for (int i = num + 1; i < numbersArr.length; i++) {
                    if (numbersArr[num] <= numbersArr[i]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.printf("%d ", numbersArr[num]);
                }
            }

        }




    }
}
