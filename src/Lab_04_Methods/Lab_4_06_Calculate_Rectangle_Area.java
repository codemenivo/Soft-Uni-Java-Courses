package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_06_Calculate_Rectangle_Area {
    public static void main(String[] args) {

        /* Създайте метод, който изчислява и "return" лицето на правоъгълник по зададена ширина и дължина.
        * */

        Scanner scanner = new Scanner(System.in);
        double with = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(with, length);
        System.out.printf("%.0f%n", area);



    }

    private static double calculateRectangleArea(double a, double b) {
        return a * b;
    }
}
