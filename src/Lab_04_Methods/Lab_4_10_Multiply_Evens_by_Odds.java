package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {

        /* Напишете програма, която прочита цяло число и умножава сумата на нечетните цифри със сумата на четните
        *  цифри на прочетеното число. Ако числото е отрицателно да се ползва абсолютната му стойност.
        * */

        Scanner scanner = new Scanner(System.in);
        int inputNum = Math.abs( Integer.parseInt(scanner.nextLine()));

        int multiple = getMuliplyEvensByOdds(inputNum);
        System.out.printf("%d%n", multiple);


    }

    private static int getMuliplyEvensByOdds(int input) {
        int evensSum = getSumOfEvensDigits(input);
        int oddsSum = getSumOfOddsDigits(input);
        return evensSum * oddsSum;
    }

    private static int getSumOfOddsDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 != 0) {
                oddSum += currentDigit;
            }
            number /= 10;
        }
        return oddSum;
    }

    private static int getSumOfEvensDigits(int number) {
        int evenSum = 0;
        while (number > 0) {

            int currentNum = number % 10;
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
            number /= 10;

        }
        return evenSum;
    }
}
