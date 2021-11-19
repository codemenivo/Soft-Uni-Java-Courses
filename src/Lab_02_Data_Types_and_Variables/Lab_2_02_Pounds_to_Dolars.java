package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_02_Pounds_to_Dolars {
    public static void main(String[] args) {
        //Напишете програма, която конвертира GBP to USD. форматирайте изхода до третия знак след десетичната запетая.
        // Отношението е : 1 British Pound = 1.31 Dollars

        Scanner scanner = new Scanner(System.in);
        double gbPounds = Double.parseDouble(scanner.nextLine());
        double usDolars = gbPounds * 1.31;
        System.out.printf("%.3f%n", usDolars);




    }
}
