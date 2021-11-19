package Lab_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_03_Sum_Even_Numbers {
    public static void main(String[] args) {
        /* Прочетете от конзолата масив от числа, подадени на един ред.
        *  Намерете сумата само на четниче числа и принтирайте резултата.
        * */

        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        for (int number:numArr) {
            if (number % 2 == 0) {
                evenSum += number;
            }

        }
        System.out.printf("%d%n", evenSum);




    }
}
