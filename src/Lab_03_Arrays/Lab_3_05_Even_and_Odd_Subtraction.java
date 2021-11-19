package Lab_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_05_Even_and_Odd_Subtraction {
    public static void main(String[] args) {
        /* Напишете програма, която изчислява разликата между сумата на четните и сумата на нечетните числа в масив.
        *  Принтирайте разликата.
        * */

        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        int[] inputNum = Arrays.stream(scanner.nextLine().split("\\s+"))
                                        .mapToInt(element -> Integer.parseInt(element)).toArray();

        for (int num : inputNum) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println(evenSum - oddSum);



    }
}
