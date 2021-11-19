package Lab_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_05_List_Manipulation_Advance {
    public static void main(String[] args) {
        /* Четете списък със команди, докато не получите командата "end". Възможните команди са :
        * - Contains {number} – check if the list contains the number. If yes print "Yes",
        * otherwise print "No such number"
        * - Print even – print all the numbers that are even separated by a space
        * - Print odd – print all the numbers that are odd separated by a space
        * - Get sum – print the sum of all the numbers
        * - Filter ({condition} {number}) – print all the numbers that fulfill (изпълняват / отговарят) that condition.
        * The condition will be either '<', '>', ">=", "<="
        *
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] currendComands = command.split("\\s+");
            String action = currendComands[0];

            switch (action) {
                case "Contains":
                    int num = Integer.parseInt(currendComands[1]);
                    if (numbers.contains(num)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if ("even".equals(currendComands[1])) {
                        printEventNumsFromList(numbers);
                        System.out.println();
                    } else {
                        printOddNumsFromList(numbers);
                        System.out.println();
                    }
                    break;

                case "Get":
                    if ("sum".equals(currendComands[1])) {
                        int sum = sumAllNumbersOfList(numbers);
                        System.out.printf("%d%n", sum);
                    }
                    break;

                case "Filter":
                    if ("<".equals(currendComands[1])) {
                        int digit = Integer.parseInt(currendComands[2]);
                        printSmallerNumsFromDigit(numbers, digit);
                        System.out.println();

                    } else if ("<=".equals(currendComands[1])) {
                        int digit = Integer.parseInt(currendComands[2]);
                        printSmallerAndEqualNumsFromDigit(numbers, digit);
                        System.out.println();

                    } else if (">".equals(currendComands[1])) {
                        int digit = Integer.parseInt(currendComands[2]);
                        printBiggerNumsFromDigit(numbers, digit);
                        System.out.println();

                    } else if (">=".equals(currendComands[1])) {
                        int digit = Integer.parseInt(currendComands[2]);
                        printBiggerAndEqualNumsFromDigit(numbers, digit);
                        System.out.println();

                    }
                    break;
            }



            command = scanner.nextLine();
        }




    }

    private static void printBiggerAndEqualNumsFromDigit(List<Integer> numbers, int digit) {
        for (Integer number : numbers) {
            if (number >= digit) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static void printBiggerNumsFromDigit(List<Integer> numbers, int digit) {
        for (Integer number : numbers) {
            if (number > digit) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static void printSmallerAndEqualNumsFromDigit(List<Integer> numbers, int digit) {
        for (Integer number : numbers) {
            if (number <= digit) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static void printSmallerNumsFromDigit(List<Integer> numbers, int digit) {
        for (Integer number : numbers) {
            if (number < digit) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static int sumAllNumbersOfList(List<Integer> numbers) {
        int sumNumbers = 0;
        for (Integer number : numbers) {
            sumNumbers += number;
        }
        return sumNumbers;
    }

    private static void printOddNumsFromList(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static void printEventNumsFromList(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.printf("%d ", number);
            }
        }
    }
}
