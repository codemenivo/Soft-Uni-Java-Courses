package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_01_Integer_Operations {
    public static void main(String[] args) {
        //Прочетете четири цели числа. Съберете 1-вото и 2-то. Сумата им я разделете на 3-тото (целочислено) и
        // умножете резултата с 4-тото. Принтирайте полученият резултат.

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        result = ((num1 + num2) / num3) * num4;

        System.out.printf("%d%n", result);






    }
}
