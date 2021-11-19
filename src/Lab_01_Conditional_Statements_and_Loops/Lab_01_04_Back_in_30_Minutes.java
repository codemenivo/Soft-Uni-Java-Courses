package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_04_Back_in_30_Minutes {
    public static void main(String[] args) {
        //На входа получавате два реда: На първият са Часовете, а на вторият са Минутите. На изхода принтирайте времето
        // след 30 минути. Формата на изхода да е "hh:mm". Часовете може да са с едно или две числа, но минутите
        // трябва задължително да са две числа (водеща 0 за единичните числа).

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 30;
        if (minutes >= 60) {
            hours++;
            minutes = minutes - 60;
        }

        if (hours == 24) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);




    }
}
