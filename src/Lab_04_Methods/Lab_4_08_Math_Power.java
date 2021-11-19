package Lab_04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_4_08_Math_Power {
    public static void main(String[] args) {

        /* Напишете метод, който изчислява и връща резултата "return" от степенуване на число
        *  повдигнато на дадена степен.
        * */

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = mathPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));



    }

    private static double mathPower(double num, int pow) {
        double res = 1;
        if (pow != 0) {
           res = Math.pow(num, pow);
        }
        return res;
    }
}
