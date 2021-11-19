package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_04_Calculations {
    public static void main(String[] args) {
        /* Напишете програма, която на първият ред от входа получава Стринг ("add", "multiply", "subtract", "divide"),
         * а на следващите два реда получавате цели числа. Напишете четири метода за всяка една от математическите
         * операции и извикайте правелният метод в зависимост от командата. Методите трябва да принтират резултата
         * (needs to be void).
        * */

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                System.out.printf("%d%n", divide(firstNum, secondNum));
                break;
        }

    }

    private static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    private static void subtract(int a, int b) {
        System.out.printf("%d%n", (a - b));
    }

    private static void multiply(int a, int b) {
        System.out.printf("%d%n", (a * b));
    }

    private static void add(int a, int b) {
        System.out.printf("%d%n", (a + b));
    }
}
