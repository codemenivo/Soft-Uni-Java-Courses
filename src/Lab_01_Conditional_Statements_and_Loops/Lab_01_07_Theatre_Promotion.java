package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_07_Theatre_Promotion {
    public static void main(String[] args) {
        //Театърът се нуждае от програма за изчисляване на еденичната цена на билета съображно възрастта на зрителя и
        // денят на посещение. Ако обявената възраст на зрителя, не отговаря на някоя от зададените, да се изпише
        // "Error!". Входа ще е от два реда - на първия Типът на дея от седмицата, Втория - въздастта на зрителя.
        // На изхода принтирайте цената на билета съобразно изискванията или Error, ако възрастта не отговаря на
        // някоя от зададените.

        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if ("Weekday".equals(typeOfDay)) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 12;
            } else {
                if (age > 18 && age <= 64) {
                    price = 18;
                }
            }
        } else if ("Weekend".equals(typeOfDay)) {
            if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                price = 15;
            } else {
                if (age > 18 && age <= 64) {
                    price = 20;
                }
            }
        } else if ("Holiday".equals(typeOfDay)) {
             if (age >= 0 && age <= 18) {
                    price = 5;
             } else if (age > 18 && age <= 64) {
                    price = 12;

            } else if (age > 64 && age <= 122) {
                 price = 10;
             }
        }

        if (price != 0) {
            System.out.printf("%.0f$%n", price);
        } else {
            System.out.println("Error!");
        }


    }
}
