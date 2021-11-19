package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_10_Top_Number {
    public static void main(String[] args) {
        /* Прочетете цяло число "n" от конзолата. Намерете всички топ числа от интервала [1 … n] и ги принтирайте.
         * Топ числата съдържат следните свойства :
         *  •	Its sum of digits is divisible by 8, e.g. 8, 16, 88. (Сумата на цифрите им се дели на 8, 16. 88)
         *  •	Holds at least one odd digit, e.g. 232, 707, 87578. (В числото се сдържа поне една нечетна цифра)
        * */
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());

        printTopNumbers(inputNum);



    }

    private static void printTopNumbers(int inputNum) {
        for (int currentNum = 1; currentNum <= inputNum; currentNum++) {
            if (dividSumDigits(currentNum) && isOddDigit(currentNum)) {
                System.out.println(currentNum);
            }
        }

    }

    private static boolean isOddDigit(int currentNum) {
        int counter = 0;
        while (currentNum > 0) {
            if (currentNum % 2 == 1){
                counter++;
            }

            currentNum /= 10;
        }
        return counter >= 1;
    }

    private static boolean dividSumDigits(int currentNum) {
        int sumDigits = 0;
        while (currentNum > 0) {
            sumDigits += currentNum % 10;


            currentNum /= 10;
        }
        return sumDigits % 8 == 0;

    }


}
