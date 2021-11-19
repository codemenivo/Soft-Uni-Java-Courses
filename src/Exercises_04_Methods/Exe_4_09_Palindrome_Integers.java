package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_09_Palindrome_Integers {
    public static void main(String[] args) {
        /* Палиндрома е число, което прочетено от ляво на дясно и от дясно на ляво е едно и също - 323 или 1001.
        *  Напишете програма, която прочита положителните цели числа, до получаване на команда "END". За всяко число
        * принтирайте дали е палиндром (true) или не е (false).
         * */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            boolean isPalindrom = isPlindromTheNumber(input);
            System.out.println(isPalindrom);


            input = scanner.nextLine();
        }



    }

    private static boolean isPlindromTheNumber(String input) {
        String reverseNumber = getReverseNumber(input);
        if (reverseNumber.equals(input)) {
            return true;
        } else {
            return false;
        }
    }

    private static String getReverseNumber(String input) {
        StringBuilder reversNum = new StringBuilder();
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversNum.append(input.charAt(i));
        }
        return reversNum.toString();
    }
}
