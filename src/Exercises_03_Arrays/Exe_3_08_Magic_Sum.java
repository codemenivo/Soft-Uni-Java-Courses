package Exercises_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_3_08_Magic_Sum {
    public static void main(String[] args) {
        /* Напишете програма, която отпечатва всички уникални двойки в масив от цели числа,
         *   чиято сума е равна на дадено число.
         * */

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length - 1; index++) {

            for (int i = index + 1; i < numbers.length; i++) {
                int currentSum = 0;
                currentSum = numbers[index] + numbers[i];

                if (sum == currentSum) {
                    System.out.printf("%d %d%n", numbers[index], numbers[i]);
                }
            }
        }
    }
}
