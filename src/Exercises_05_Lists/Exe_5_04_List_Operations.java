package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_04_List_Operations {
    public static void main(String[] args) {
        /* На входа, като първи ред ще получите списък с цели числа. Докато получите командата "End" ще получавате
         * команди за опериции,които трябва да приложите за списъка. Възможните команди са :
         *      •	Add {number} - add number at the end
         *      •	Insert {number} {index} - insert number at given index
         *      •	Remove {index} - remove that index
         *      •	Shift left {count} - first number becomes last 'count' times
         *      •	Shift right {count} - last number becomes first 'count' times
         *  Забележка: Възможно е даденият индекс да е извън границите на масива.
         *  В този случай отпечатайте "Invalid index".
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String commandData = scanner.nextLine();
        while (!"End".equals(commandData)) {
            String[] command = commandData.split("\\s+");

            switch (command[0]) {

                case "Add":
                    int num = Integer.parseInt(command[1]);

                    addNumberAtTheList(numbers, num);
                    break;

                case "Insert":
                    int digit = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);

                    if (index >= 0 && index < numbers.size()) {
                        insertDigitAtGivenIndex(numbers, digit, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int position = Integer.parseInt(command[1]);

                    if (position >= 0 && position < numbers.size()) {
                        removeNumByIndex(numbers, position);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    String action = command[1];
                    int rotation = Integer.parseInt(command[2]);

                    if ("left".equals(action)) {
                        leftRotationNumbersOfList(numbers, rotation);
                    } else {
                        rightRotationNumbersOfList(numbers, rotation);
                    }
                    break;

            }


            commandData = scanner.nextLine();
        }

        printListNumbers(numbers);

    }

    private static void printListNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void rightRotationNumbersOfList(List<Integer> numbers, int rotation) {
        while (rotation > 0){

            int currentNum = numbers.get(numbers.size() - 1);
            numbers.add(0, currentNum);
            numbers.remove(numbers.size() - 1);

            rotation--;
        }
    }

    private static void leftRotationNumbersOfList(List<Integer> numbers, int rotation) {
        while (rotation > 0){
            int currentNum = numbers.get(0);
            numbers.add(currentNum);
            numbers.remove(0);

            rotation--;
        }
    }

    private static void removeNumByIndex(List<Integer> numbers, int position) {
        numbers.remove(position);
    }

    private static void insertDigitAtGivenIndex(List<Integer> numbers, int digit, int index) {
        numbers.add(index, digit);
    }

    private static void addNumberAtTheList(List<Integer> numbers, int num) {
        numbers.add(num);
    }
}
