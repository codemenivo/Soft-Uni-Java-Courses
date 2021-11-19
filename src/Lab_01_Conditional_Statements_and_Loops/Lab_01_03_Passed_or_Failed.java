package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_03_Passed_or_Failed {
    public static void main(String[] args) {
        //използвайте условието на Lab2 и променете програмата така, че да изписва "Failed!", когато успеха на
        // студента е по-малък от 3.00.

        Scanner scanner = new Scanner(System.in);
        double avGrade = Double.parseDouble(scanner.nextLine());

        if (avGrade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }




    }
}
