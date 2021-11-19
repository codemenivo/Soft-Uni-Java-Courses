package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_07_Repeat_String {
    public static void main(String[] args) {

        /* Напишете метод, който получава String и го повтаря "n" (цяло число) на брой пъти.
        *  Метода трябва да върне (return) нов стринг -> входният стринг повторен "n" на брой пъти.
        * */

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        String output = printRepeatString(inputStr, number);


        System.out.printf("%s%n", output);


    }

    private static String printRepeatString(String text, int num) {
        StringBuilder result = new StringBuilder();
        result.append(String.valueOf(text).repeat(Math.max(0, num)));
        return result.toString();
    }
}
