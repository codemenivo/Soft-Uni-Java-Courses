package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_02_Grades {
    public static void main(String[] args) {
        /* Напишете метод, който получава оценка между 2.00 и 6.00 и отпечатва съответната оценка с думи:
        *   •	2.00 – 2.99 - "Fail"
            •	3.00 – 3.49 - "Poor"
            •	3.50 – 4.49 - "Good"
            •	4.50 – 5.49 - "Very good"
            •	5.50 – 6.00 - "Excellent"
        * */

        Scanner scanner = new Scanner(System.in);
        printGradeWord (Double.parseDouble(scanner.nextLine()));



    }

    private static void printGradeWord(double number) {
        if (number >= 5.50 && number <= 6.00) {
            System.out.printf("Excellent%n");
        } else if (number >= 4.50) {
            System.out.printf("Very good%n");
        } else if (number >= 3.50) {
            System.out.printf("Good%n");
        } else if (number >= 3.00) {
            System.out.printf("Poor%n");
        } else if (number >= 2.00) {
            System.out.printf("Fail%n");
        }
    }
}
