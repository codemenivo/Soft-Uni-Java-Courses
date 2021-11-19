package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_01_Sign_of_Integer_Numbers {
    public static void main(String[] args) {
        /* Създайте метод, който принира цели числа. На всеки ред на входа ще получавате по едно цяло число.
           Изхода да е във формат : "The number {int} is positive."
                                    "The number {int} is negative."
                                    "The number 0 is zero." */

        Scanner scanner = new Scanner(System.in);

        printSign(Integer.parseInt(scanner.nextLine()));


    }

    private static void printSign(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.%n", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.%n", number);
        } else {
            System.out.printf("The number 0 is zero.%n");
        }
    }
}
