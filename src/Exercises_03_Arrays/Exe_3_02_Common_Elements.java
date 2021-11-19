package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_02_Common_Elements {
    public static void main(String[] args) {
        /* Напишете програма, която отпечатва общи елементи в два масива. Трябва да сравните елементите на
        *  втория масив с елементите на първия.
        * На входа получавате на всеки ред по един масив от данни разделени с интррвал.
        * */

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split("\\s+");
        String[] secondArr = scanner.nextLine().split("\\s+");

        for (String word : secondArr) {
            for (String str : firstArr) {
                if (word.equals(str)) {
                    System.out.printf("%s ", word);
                }
            }
        }


    }
}
