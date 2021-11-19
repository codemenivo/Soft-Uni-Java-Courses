package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_05_Month_Printer {
    public static void main(String[] args) {
        //Напишете прогрсмс, която приема за вход цяло число от конзолата и изписва името на съответният месец.
        // Ако числото е по-малко от 1 или по-голямо от 12 изписва "Error!".

        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error!");
        }




    }
}
