package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_05_Orders {
    public static void main(String[] args) {

        /* Напишете метод, който изчислява и принтира на конзолата крайната цена на поръчка. Метода ще получи един от
           следните продукти: coffee, water, coke, snacks; и количеството за поръчаният продукт. Еденичната цена за
        *  всеки продукт е:
        •	coffee – 1.50
        •	water – 1.00
        •	coke – 1.40
        •	snacks – 2.00
        *   Принтирайте резултата, като закръглите до вторият знак след десетичната запетая. */

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;

            case "water":
                price = 1.00;
                break;

            case "coke":
                price = 1.40;
                break;

            case "snacks":
                price = 2.00;
                break;
        }
        double total = calculateTotalPrice(price, quantity);
        System.out.printf("%.2f%n", total);

    }

    private static double calculateTotalPrice(double aPrice, int aQuantity) {
        return aPrice * aQuantity;
    }
}
