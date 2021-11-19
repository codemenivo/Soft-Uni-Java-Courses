package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_04_Password_Validator {
    public static void main(String[] args) {
        /* Напишете програма, която проверява даали даденатапарола е валидна.
         *  Условия за валидност на паролата:
         * •	6 – 10 characters (inclusive);
         * •	Consists only of letters and digits;
         * •	Have at least 2 digits.
         * Ако паролата е валидна принтирайте: print "Password is valid".
         * Ако паролата не е валина за всяко не изпълнено правило отпечатайте съответното съобщение:
         * •	"Password must be between 6 and 10 characters";
         * •	"Password must consist only of letters and digits";
         * •	"Password must have at least 2 digits".
         * */

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValidPassLength = isValidLength(password);
        if (!isValidPassLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isConsistOnlyOfLetersAndDigits(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isLeast2Didits = isHaveAtLeast2Digits(password);
        if (!isLeast2Didits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidPassLength && isValidContent && isLeast2Didits) {
            System.out.println("Password is valid");
        }


    }

    private static boolean isHaveAtLeast2Digits(String password) {
        int counter = 0;
        for (int index = 0; index < password.length(); index++) {
            char currentSim = password.charAt(index);
            if (Character.isDigit(currentSim)) {
                counter++;
            }
        }
        return counter >= 2;
    }

    private static boolean isConsistOnlyOfLetersAndDigits(String password) {
        for (int index = 0; index < password.length(); index++) {
            char currentChar = password.charAt(index);
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

}