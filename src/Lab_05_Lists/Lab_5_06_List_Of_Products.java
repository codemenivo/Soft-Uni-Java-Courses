package Lab_05_Lists;

import java.util.*;

public class Lab_5_06_List_Of_Products {
    public static void main(String[] args) {
        /* На първият ред на входа ще получите цялочисло n. На следващите n редеа ще получавате имена на продукти.
        * Отпечатайте номериран списък с имената на продуктите подредени по азбучен ред спрямо първата буква
        * от името на продукта.
        * */

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String productName = scanner.nextLine();
            products.add(productName);
        }
        Collections.sort(products);

        printOrderedList(products);



    }

    private static void printOrderedList(List<String> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
