package Lab_04_Methods;

import java.util.Scanner;

public class Lab_4_09_Greater_of_Two_Values {
    public static void main(String[] args) {

        /* Като вход получавате две стойности от един и същи тип. Стойностите могат да бъдат от следните типове:
        *  "int, char of String" . Създайте метод getMax(), който връща (return) по-голямата от двете стойности.
         * */

        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();

        switch (dataType) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                int resultInt = getMax(num1, num2);
                System.out.printf("%d%n",resultInt);
                break;
            case "char":
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                char resultChar = getMax(ch1, ch2);
                System.out.printf("%c%n", resultChar);
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                String resultStr = getMax(str1, str2);
                System.out.printf("%s%n", resultStr);
                break;

        }



    }

    private static int getMax(int digit1, int digit2) {
        return (Math.max(digit1, digit2));
    }

    private static char getMax(char sim1, char sim2) {
        int currentNum = Character.compare(sim1, sim2);
        if (currentNum >= 0) {
            return sim1;
        } else {
            return sim2;
        }

    }

    private static String getMax(String text1, String text2) {
        int resNum = text1.compareTo(text2);
        if (resNum >= 0) {
            return text1;
        } else {
            return text2;
        }

    }
}
