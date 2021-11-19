package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_03_Print_Triangle {
    public static void main(String[] args) {
        /* Създайте метод за принтиране на триъгълник от цифри. На входа ще получите едно цяло число,
            което ще показва крайната стойност, която трябва да се принтира. Пример : 3
            1
            1 2
            1 2 3
            1 2
            1
        * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNumTriangle (number);


    }

    private static void printNumTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
