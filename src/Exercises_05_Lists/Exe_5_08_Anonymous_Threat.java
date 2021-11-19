package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_08_Anonymous_Threat {
    public static void main(String[] args) {
        /* Входа ще е един ред от Стрингове разделени с интервал. Низовете могат да съдържат всякакви ASCII символи
        * без интервал. След това ще получите команда в един от следните формати:
        *   •	merge {startIndex} {endIndex}
        *   •	divide {index} {partitions}
        * Всеки път, когато получите команда "merge command" трябва да обедините всички елементи startIndex до endIndex.
        * Т.е. трябва да ги Конкатенирате (concatenate them).
        *  Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
        * Ако някой от дадените индекси е извън масива, трябва да се вземе само диапазона, който е вътре в масива и да
        * го обедините.
        * Всеки път, когато получите команда "divide command", трябва да разделите елементите с даден индекс на няколко
        * малки поднизове с еднаква дължина. Броят на поднизовете трябва да е равен на дадените дялове.
        *  Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
        * Ако поднизът не може да бъде разделен точно на дадените дялове, направете всички дялове с изключение на
        * последния с равна дължина и направете последният най-дълъг.
        *  Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
        * Подаването на входни данни приключва, когато получите команда  "3:1". След това трябва да отпечатате
        *  получените елементи разделени с интервал.
         *  Вход:
         *       •	The first input line will contain the array of data
         *       •	On the next several input lines you will receive commands in the format specified above
         *       •	The input ends when you receive the command "3:1"
         *  Изход:
         *      •	As output you must print a single line containing the elements of the array, joined by a space.
         *  Ограничения:
         *      •	The strings in the array may contain any ASCII character except whitespace
         *      •	The startIndex and the endIndex will be in range [-1000, 1000]
         *      •	The endIndex will ALWAYS be GREATER than the startIndex
         *      •	The index in the divide command will ALWAYS be INSIDE the array
         *      •	The partitions will be in range [0, 100]
         *      •	Allowed working time/memory: 100ms / 16MB
        * */

        Scanner scanner = new Scanner(System.in);

        List<String> strSequences = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"3:1".equals(command)) {
            String[] action = command.split("\\s+");
            String subCommand = action[0];
            int startIndex = Integer.parseInt(action[1]);
            if (startIndex < 0) {
                startIndex = 0;
            }
            if (startIndex >= 0 && startIndex < strSequences.size()) {
                switch (subCommand) {
                    case "merge":
                        int endIndex = Integer.parseInt(action[2]);
                        if (endIndex > strSequences.size() - 1) {
                            endIndex = strSequences.size() - 1;
                        }

                        strSequences = margSequencesInList(strSequences, startIndex, endIndex);

                        break;

                    case "divide":
                        int divider = Integer.parseInt(action[2]);

                        if (divider > 0 && divider <= 100) {
                            strSequences = divideSequenceByParts(strSequences, startIndex, divider);
                        }
                        break;
                }

            }

            command = scanner.nextLine();
        }

        printResultString(strSequences);

    }

    private static void printResultString(List<String> strSequences) {
        for (String sequence : strSequences) {
            System.out.printf("%s ", sequence);
        }
        System.out.println();
    }

    private static List<String> divideSequenceByParts(List<String> strSequences, int startIndex, int divider) {
        String divideElement = strSequences.get(startIndex);
        strSequences.remove(startIndex);
        int partSize = divideElement.length() / divider;
        int begin = 0;

        for (int part = 1; part < divider; part++) {
            strSequences.add(startIndex, divideElement.substring(begin, begin + partSize));
            startIndex++;
            begin += partSize;
        }
        strSequences.add(startIndex, divideElement.substring(begin));

        return strSequences;
    }

    private static List<String> margSequencesInList(List<String> strSequences, int startIndex, int endIndex) {
        StringBuilder currentStr = new StringBuilder();
        for (int i = startIndex; i <= endIndex; i++) {
            currentStr.append(strSequences.get(i));
            strSequences.remove(i);
            i--;
            endIndex--;
        }
        strSequences.add(startIndex, currentStr.toString());

        return strSequences;
    }
}
