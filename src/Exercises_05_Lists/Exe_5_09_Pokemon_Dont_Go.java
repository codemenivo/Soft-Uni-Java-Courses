package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_09_Pokemon_Dont_Go {
    public static void main(String[] args) {
        /* Ще получите поредица от цели числа, разделени с интервали - разстоянията до покемоните. След това ще
        * започнете да получавате цели числа, които ще съответстват на индекси в тази последователност. Когато получите
        * индекс, трябва да премахнете елемента в този индекс от последователността (като че ли сте заловили покемона).
        *   • Трябва да УВЕЛИЧИТЕ стойността на всички елементи в последователността, които са ПО-МАЛКИ или равни на
        * премахнатия елемент, със стойността на премахнатия елемент.
        *   • Трябва да НАМАЛИТЕ стойността на всички елементи в последователността, които са ПО-ГОЛЯМИ от премахнатия
        * елемент, със стойността на премахнатия елемент.
        *   Ако даденият индекс е ПО-МАЛКО от 0, премахнете първия елемент от последователността и КОПИРАЙТЕ последния
        * елемент на неговото място.
        *   Ако даденият индекс е ПО-ГОЛЯМ от последния индекс на последователността, премахнете последния елемент от
        * последователността и КОПИРАЙТЕ първия елемент на неговото място.
        *   Увеличаването и намаляването на елементите трябва да се извършва и в тези случаи. Елементът, чиято стойност
        * трябва да използвате, е премахнатият елемент.
        * Програмата приключва, когато последователността няма елементи (няма покемони, които Ели да хване).
        *   Вход:
        *   •	On the first line of input you will receive a sequence of integers, separated by spaces.
        *   •	On the next several lines you will receive integers – the indexes
        *   Изход:
        *   •	When the program ends, you must print on the console, the summed up value of all REMOVED elements.
        *   Ограничения:
        *   •	The input data will consist ONLY of valid integers in the range [-2.147.483.648, 2.147.483.647]
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumDigit = 0;
        int currentIndex = Integer.parseInt(scanner.nextLine());

        while (input.size() > 1) {

            if (currentIndex < 0) {
                int numForAction = input.get(0);
                sumDigit += numForAction;

                changeInputList(input, numForAction);

            } else if (currentIndex > input.size() - 1) {
                int numForAction = input.get(input.size() - 1);
                sumDigit += numForAction;
                int firstNum = input.get(0);
                input.set(input.size() - 1, firstNum);

                calculateValueOfListNumbers(input, numForAction);

            } else {
                    int numForAction = input.get(currentIndex);
                    input.remove(currentIndex);
                    sumDigit += numForAction;

                    calculateValueOfListNumbers(input, numForAction);

            }

            currentIndex = Integer.parseInt(scanner.nextLine());
        }


        if (input.size() == 1) {
                int numForAction = input.get(0);
                input.remove(0);
                sumDigit += numForAction;


        }

        System.out.printf("%d%n", sumDigit);

    }

    private static void changeInputList(List<Integer> input, int numForAction) {
        int lastNum = input.get(input.size() - 1);
        input.set(0, lastNum);

        calculateValueOfListNumbers(input, numForAction);

    }

    private static void calculateValueOfListNumbers(List<Integer> input, int numForAction) {
        for (int i = 0; i < input.size(); i++) {
            int digit = input.get(i);
            if (digit <= numForAction) {
                digit += numForAction;
                input.set(i, digit);
            } else {
                digit -= numForAction;
                input.set(i, digit);
            }
        }
    }
}
