package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_06_Foreign_Languages {
    public static void main(String[] args) {
        //Напишете програма, която принтира езика за посочена държава. Може да получите само следните комбинации:
        // English is spoken in England and USA; Spanish is spoken in Spain, Argentina and Mexico;
        // for the others, we should print "unknown". На входа на всеки ред ще получавате име на държава. На изхода
        // принтирайте, кой език е за посочената държава или "unknown".

        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();

        switch (countryName) {
            case "England":
            case "USA":
                    System.out.println("English");
                    break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }




    }
}
