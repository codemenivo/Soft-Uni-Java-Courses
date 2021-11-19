package Lab_03_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_06_Equal_Arrays {
    public static void main(String[] args) {
        /* Прочетете два масива и отпечатайте на конзолата, независимо дали са идентични или не. Масивите са идентични,
        *  ако елементите им са равни. Ако масивите са идентични, намерете сумата на първия и отпечатайте на конзолата
        *  следното съобщение: "Arrays are identical. Sum: {sum}", в противен случай намерете първия индекс,
        *  където масивите се различават и отпечатайте на конзолата следното съобщение:
        *  "Arrays are not identical. Found difference at {index} index."
        * */

        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(element -> Integer.parseInt(element)).toArray();

        String[] secondInput = scanner.nextLine().split("\\s+");
        int[] secondArr = new int[secondInput.length];
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = Integer.parseInt(secondInput[i]);
        }

        int sumArr = 0;
        boolean flag = false;
        for (int k = 0; k < secondArr.length; k++) {
            if (firstArr[k] != secondArr[k]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", k);
                return;
            } else {
                sumArr += firstArr[k];
                flag = true;
            }
        }
        if (flag) {
            System.out.printf("Arrays are identical. Sum: %d%n", sumArr);
        }




    }
}
