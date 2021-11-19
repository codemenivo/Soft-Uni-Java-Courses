package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_06_Equal_Sums {
    public static void main(String[] args) {
        /* Напишете програма, която определя дали в масива съществува елемент, така че сумата на елементите отляво да
        *  е равна на сумата от елементите отдясно. Ако вляво / вдясно няма елементи, тяхната сума се счита за 0.
        * Отпечатайте индекса, който отговаря на необходимото условие, или „no“, ако няма такъв индекс.
        * */

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        boolean isFound = false;
        for (int index = 0; index < numbers.length; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum) {
                System.out.printf("%d%n", index);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }




    }
}
