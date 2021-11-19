package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_07_Vending_Machine {
    public static void main(String[] args) {
        //Задачата е да се изчисли крайната цена на покупките от Вендинг автомат. Дакато не получите команда "Start" ,
        // ще получавате различни монети във входа на машината. Трябва да ги сумирате и това ще е общата сума с която
        // ще можете да пазарувате. Машината работи само с 0.1, 0.2, 0.5, 1, and 2 coins. Ако се въведе друга монета
        // трябва да се изведе съобщение "Cannot accept {money}", като стойността се форматира до втората цифра
        // след десетичната запетая и не я добавя към общите пари. На следващите редове, до получаване на команда "End",
        // ще получавате имената продуктите, които купувате. Машината има само "Nuts", "Water", "Crisps", "Soda","Coke"
        // Съответно цените им са : 2.0, 0.7, 1.5, 0.8, 1.0  . Ако някой се опита да купи несъществуващ продукт, да се
        // изведе съобщение “Invalid product”. Внимавайте може да се опита да закупи продукт, за който няма пари.
        // В този случай отпечатайте "Sorry, not enough money". Ако покупката е успешна отпечатайте съобщение:
        // "Purchased {product name}". След командата "End" отпечатайте парите, които са останали във формат:
        // "Change: {money left}" и форматирани до вторият знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoneyInserted = 0.0;

        while (!"Start".equals(input)) {
            double insertedCoin = Double.parseDouble(input);
            if ((insertedCoin != 0.1) && (insertedCoin != 0.2)
                    && (insertedCoin != 0.5) && (insertedCoin != 1.0) && (insertedCoin != 2.0)) {
                System.out.printf("Cannot accept %.2f%n", insertedCoin);
            } else {
                totalMoneyInserted += insertedCoin;
            }


            input = scanner.nextLine();
        }
        String products = scanner.nextLine();
        double priceProducts = 0.0;
        while (!"End".equals(products)) {
            switch (products) {
                case "Nuts":
                    priceProducts = 2.0;
                    break;
                case "Water":
                    priceProducts = 0.7;
                    break;
                case "Crisps":
                    priceProducts = 1.5;
                    break;
                case "Soda":
                    priceProducts = 0.8;
                    break;
                case "Coke":
                    priceProducts = 1.0;
                    break;
                default: {
                    System.out.println("Invalid product");
                    products =scanner.nextLine();
                    continue;

                }
            }

            if (totalMoneyInserted >= priceProducts) {
                totalMoneyInserted -= priceProducts;
                System.out.printf("Purchased %s%n", products);
            } else {
                System.out.println("Sorry, not enough money");
            }



            products = scanner.nextLine();
        }

        System.out.printf("Change: %.2f%n", totalMoneyInserted);


    }
}
