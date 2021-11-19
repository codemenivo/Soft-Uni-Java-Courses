package Lab_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_02_Print_Numbers_in_Reverse_Order {
    public static void main(String[] args) {
        /* Read n numbers and print them in reverse order.
        * Прочетете  n - броят на числата, които ще получите на всеки ред от конзолата.
        * Принтирайте масив на един ред със същите числа, но подредени в обратен ред и разделени с интервал.
        * */

        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());


        int[] arr = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            int currentDigit = Integer.parseInt(scanner.nextLine());
            arr[(numbers - 1) - i] = currentDigit;
        }
        for (int print = 0; print < numbers ; print++) {
            System.out.print(arr[print] + " ");
        }
        System.out.println();



    }
}
