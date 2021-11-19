package Lab_05_Lists;

import java.io.LineNumberInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_01_Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        /* Напишете програма за сумиране на всички съседни равни числа в списък с десетични числа, започвайки отляво
        *  надясно.
        *  • След като се сумират две числа, полученият резултат може да бъде равен на някои от неговите съседи
        *  и също трябва да бъде сумиран (вижте примерите по -долу).
        *  • Винаги сумирайте най - левите две равни съседни числа (ако са налични няколко двойки равни съседни числа).
        * */

        Scanner scanner = new Scanner(System.in);
        // Това е стандартният начина за запълването на List без използването на Stream.
        //List<Double> numberList = new ArrayList<>();
        //String[] input = scanner.nextLine().split("\\s+");
        //for (String strNum : input) {
        //    numberList.add(Double.parseDouble(strNum));
        //}
        List<Double> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                                        .map(Double::parseDouble)
                                        .collect(Collectors.toList());

        refactoringNumberList(numberList);

        printNewNumberList(numberList);

        System.out.println();




    }

    private static void printNewNumberList(List<Double> numberList) {
        DecimalFormat decimalNum = new DecimalFormat("0.#");
        for (Double number : numberList) {
            System.out.print(decimalNum.format(number) + " ");
        }
    }

    private static void refactoringNumberList(List<Double> numberList) {
        for (int index = 0; index < numberList.size() - 1; index++) {
            double currentNum = numberList.get(index);
            double nextNum = numberList.get(index + 1);
            if (currentNum == nextNum) {
                numberList.set(index, (currentNum + nextNum));
                numberList.remove(index + 1);
                index = -1;
            }

        }
    }
}
