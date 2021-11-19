package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_13_Refactor_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        //Възложено ви е да намерите и отстраните грешките в съществуващ код, като използвате дебъгера. Трябва да
        // проследите изпълнението на програмата, за да намерите редовете код, които дават неправилни или неочаквани
        // резултати.
        //Получава се програма (съществуващ изходен код), която отпечатва следващите n нечетни числа (започвайки от 1)
        // и на последния ред отпечатва сумата от тях.

        //Input code:
        //Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        //int sum = 1;
        //for (int i = 0; i <= n; i++) {
        //    System.out.print(2 * i + 1);
        //    sum += 2 * i;
        //}
        //System.out.printf("Sum: %d%n", sum);

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n", sum);





    }
}
