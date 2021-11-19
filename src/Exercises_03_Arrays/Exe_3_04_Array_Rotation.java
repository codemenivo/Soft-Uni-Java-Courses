package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_04_Array_Rotation {
    public static void main(String[] args) {
        /* Напишете програма, която получава масив и брой завъртания, които трябва да извършите
        *  (първият елемент отива в края) Отпечатайте получения масив.
        * */

        Scanner scanner = new Scanner(System.in);

            // Вариант 1
/*        int[] inputArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < numberOfRotation; rotation++) {
            int currentNum = inputArr[0];

            for (int i = 0; i < inputArr.length - 1; i++) {
                inputArr[i] = inputArr[i + 1];
            }

            inputArr[inputArr.length - 1] = currentNum;
        }

        for (int digit : inputArr) {
            System.out.printf("%s ", digit);
        }

        System.out.println(); */

        // Вариант 2 - Из ползване на String, защото няма математически операции

        String[] inputArr = scanner.nextLine().split("\\s+");
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= numberOfRotation; rotation++) {
            String currentElement = inputArr[0];

            for (int index = 0; index < inputArr.length - 1; index++) {
                inputArr[index] = inputArr[index + 1];
            }

            inputArr[inputArr.length - 1] = currentElement;
        }

        System.out.println(String.join(" ", inputArr));

        

    }
}
