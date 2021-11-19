package ScaleFocus;

import java.util.Scanner;

public class Scale_02_01_ZigZag_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int nRows = Integer.parseInt(scanner.nextLine());

        StringBuilder resultText = new StringBuilder();
        if (nRows == 2) {
            for (int i = 0; i < nRows; i++) {
                for (int j = i; j < text.length(); j += nRows) {
                    resultText.append(text.charAt(j));
                }
            }
            System.out.printf("%s%n", resultText);

        } else if (nRows >= 3) {
           for (int i = 0; i < nRows; i++) {
                if (i == 0 || i == nRows - 1) {
                    for (int j = i; j < text.length(); j += ((2 * nRows) - 2)) {
                        resultText.append(text.charAt(j));
                    }
                } else {
                    if (nRows == 3) {
                        for (int j2 = i; j2 < text.length(); j2 += nRows - 1) {
                            resultText.append(text.charAt(j2));
                        }
                    } else {
                        for (int j2 = i; j2 < text.length(); j2 += ((2 * nRows) - 2)) {
                            resultText.append(text.charAt(j2));
                        }
                        for (int j3 = ((2 * nRows) - 2) - i; j3 < text.length(); j3 += ((2 * nRows) - 2)) {
                            resultText.append(text.charAt(j3));
                        }
                    }
                }
            }
            System.out.printf("%s%n", resultText);
        }


        // От тук започва първоначалният вариан след отпечатването за (nRows == 2) преди оптимизиране на кода.
        //  } else if (nRows == 3) {
         /*   for (int i = 0; i < nRows; i++) {
                if (i == 0 || i == nRows - 1) {
                    for (int j = i; j < text.length(); j += ((2 * nRows) - 2)) {
                        resultText.append(text.charAt(j));
                    }
                } else {
                    for (int j2 = i; j2 < text.length(); j2 += nRows - 1) {
                        resultText.append(text.charAt(j2));
                    }
                }
            }
            System.out.printf("%s%n", resultText);
        } else if (nRows > 3) {
            for (int i = 0; i < nRows; i++) {
                if (i == 0 || i == nRows - 1) {
                    for (int j = i; j < text.length(); j += ((2 * nRows) - 2)) {
                        resultText.append(text.charAt(j));
                    }
                } else {
                    for (int j2 = i; j2 < text.length(); j2 += ((2 * nRows) - 2)) {
                        resultText.append(text.charAt(j2));
                    }
                    for (int j3 = ((2 * nRows) - 2) - i; j3 < text.length(); j3 += ((2 * nRows) - 2)) {
                        resultText.append(text.charAt(j3));
                    }
                }
            }
            System.out.printf("%s%n", resultText);
        }  */

        //convertStr(text, nRows);


        //System.out.printf("%s%n", convertStr(text, nRows));

    }

    // Методите не се използват в това решение!
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

    private static String convertStr(String inputStr, int n) {

        StringBuilder outputStr = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < inputStr.length(); j += n + 1) {
                outputStr.append(inputStr.charAt(j));
            }

        }
        return outputStr.toString();
    }
}
//PAYPALISHIRING