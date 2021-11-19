package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_09_Centuries_To_Minutes {
    public static void main(String[] args) {
        // Напишете програма, която превръща заденото цяло число векове в years, days, hours and minutes.
        // Използвайте подходящи типове данни.
        // •	Assume that a year has 365.2422 days at average (the Tropical year).

        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
                double years = centuries * 100;
                double days = years * 365.2422;
                double hours = days * 24;
                double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes%n", centuries, years,
                            days, hours, minutes);






    }
}
