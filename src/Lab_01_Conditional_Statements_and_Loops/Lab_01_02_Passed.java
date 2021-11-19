package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_02_Passed {
    public static void main(String[] args) {
        //Напишете програма, която получава средният успех на студента и принтирайте "Passed" ако средният успех е
        // по-голям или равен на от 3.00

        Scanner scanner = new Scanner(System.in);
        double avGrade = Double.parseDouble(scanner.nextLine());

        if (avGrade >= 3.00) {
            System.out.printf("Passed!");
        }



    }
}
