package ScaleFocus;

import java.util.Scanner;

public class Scale_02_02_ZigZag_String_With_Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int nRows = Integer.parseInt(scanner.nextLine());

        if (nRows == 2) {
            convertForTwoRows(text, nRows);
            System.out.printf("%s%n", convertForTwoRows(text, nRows));


        } else if (nRows >= 3) {
            convertThreeRowsAndMore(text, nRows);
            System.out.printf("%s%n", convertThreeRowsAndMore(text, nRows));


        }


    }
    private static String convertThreeRowsAndMore(String inputTxt, int rows) {
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows - 1) {
                for (int j = i; j < inputTxt.length(); j += ((2 * rows) - 2)) {
                    resultStr.append(inputTxt.charAt(j));
                }
            } else {
                if (rows == 3) {
                    for (int j2 = i; j2 < inputTxt.length(); j2 += rows - 1) {
                        resultStr.append(inputTxt.charAt(j2));
                    }
                } else {
                    for (int j2 = i; j2 < inputTxt.length(); j2 += ((2 * rows) - 2)) {
                        resultStr.append(inputTxt.charAt(j2));
                    }
                    for (int j3 = ((2 * rows) - 2) - i; j3 < inputTxt.length(); j3 += ((2 * rows) - 2)) {
                        resultStr.append(inputTxt.charAt(j3));
                    }
                }
            }
        }
        return resultStr.toString();
    }

    private static String convertForTwoRows(String inputtext, int rows) {
        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < inputtext.length(); j += rows) {
                resultStr.append(inputtext.charAt(j));
            }
        }
        return resultStr.toString();
    }



}
//PAYPALISHIRING