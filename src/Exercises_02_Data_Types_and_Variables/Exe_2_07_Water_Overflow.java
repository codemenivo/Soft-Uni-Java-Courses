package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_07_Water_Overflow {
    public static void main(String[] args) {
        //Имате контейнер за вода с капацитет 255 литра. На следващите "n" реда ще получавате числа, които показват
        // колко литра трябва да налеете във вашият контейнер. Ако капацитета на контейнера не е достатъчен,
        // принтирайта съобщение : “Insufficient capacity!” и продължете да четете на следващият ред. След като
        // прочетете данните от последният ред принтирайте налятото количество вода в контейнета.
        // Вход: На първият ред ще получите число "n", което показва броят на редовете, които ще последват.
        // На следващите "n" реда ще получавате количествата вода, които трябва да се прилеят в контейнера.
        // Всеки път, когато нямате достатъчно вместимост в резервоара, за да налеете дадените литри, отпечатайте:
        // Insufficient capacity!
        // На последния ред отпечатайте само литрите в резервоара.
        // n will be in the interval [1…20] , liters will be in the interval [1…1000]

        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int tankVolume = 255;
        int quantityLitersInTank = 0;

        for (int line = 1; line <= numLines; line++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (tankVolume - currentLiters >= 0) {
                tankVolume -= currentLiters;
                quantityLitersInTank += currentLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d%n", quantityLitersInTank);




    }
}
