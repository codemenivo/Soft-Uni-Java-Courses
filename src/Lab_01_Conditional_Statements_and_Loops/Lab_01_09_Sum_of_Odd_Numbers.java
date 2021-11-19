package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_09_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        //Напишете програма, която принтира следващите N нечетни числа, като започва от 1 и на последният ред
        // принтира тяхната сума. На входа ще получите "n" , което показва, колко нечетни числа трябва да принтирате.
        //"n" е в интервала от [1 ... 100]. На изхода принтирайте всяко нечетно число и сумата им на нов ред.

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

            for (int i = 1; i <= number ; i ++) {
                int currentNum = (i * 2) - 1;
                sum += currentNum;
                System.out.printf("%d%n", currentNum);
            }


        System.out.printf("Sum: %d%n", sum);




    }
}
