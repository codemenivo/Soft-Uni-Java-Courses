package Exercises_05_Lists;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_02_Change_List {
    public static void main(String[] args) {
    /* Напишете програма, която чете Лист с цели числа от конзолата и получава команди, с които се манипулира списъка.
    * Командите могат да бъдат:
    *    •	Delete {element} - delete all elements in the array, which are equal to the given element
    *    •	Insert {element} {position} - insert element at the given position
    * Програмата трябва да приключи при получаване на команда "end". На изхода принтирайте всички числа от
    * списъка разделени с интервал.
     * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] commandData = command.split("\\s+");
            switch (commandData[0]) {
                case "Delete":
                    int element = Integer.parseInt(commandData[1]);
                    deleteElementFromList(numbers, element);
                    break;

                case "Insert":
                    int num = Integer.parseInt(commandData[1]);
                    int position = Integer.parseInt(commandData[2]);
                    insertElementAtTheGivenPosition(numbers, num, position);
                    break;
            }


            command = scanner.nextLine();
        }

        printfinalListNumbers(numbers);

    }

    private static void printfinalListNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void insertElementAtTheGivenPosition(List<Integer> numbers, int num, int position) {
        numbers.add(position, num);
    }

    private static void deleteElementFromList(List<Integer> numbers, int element) {
        if (numbers.contains(element)) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == element) {
                    numbers.remove(Integer.valueOf(numbers.get(i)));
                    i--;
                }
            }
        }
    }



}
