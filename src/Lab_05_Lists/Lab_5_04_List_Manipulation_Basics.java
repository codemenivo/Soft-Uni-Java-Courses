package Lab_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_04_List_Manipulation_Basics {
    public static void main(String[] args) {
        /* Напишете програма, която чете списък от цели числа. Докато не получите команда "end", ще получавате разли1ни
        * команди : - Add {number}: add a number to the end of the list
        * - Remove {number}: remove a number from the list
        * - RemoveAt {index}: remove a number at a given index
        * - Insert {number} {index}: insert a number at a given index
        * - Note: All the indices will be valid!
        * Когато получите "end" командата принтирайте крайното състояние на списъка, като елентоте му да са оделени
        * с интервал.
         * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        //String[] command = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] currentAction = command.split("\\s+");
            String firstCommand = currentAction[0];

            switch (firstCommand) {

                case "Add":
                    int currentNum = Integer.parseInt(currentAction[1]);
                    numbers.add(currentNum);
                    break;

                case "Remove":
                    int removeNum = Integer.parseInt(currentAction[1]);
                    numbers.remove(Integer.valueOf(removeNum));
                    break;

                case "RemoveAt":
                    int removeByIndex = Integer.parseInt(currentAction[1]);
                    numbers.remove(removeByIndex);
                    break;

                case "Insert":
                    int num = Integer.parseInt(currentAction[1]);
                    int index = Integer.parseInt(currentAction[2]);
                    numbers.add(index, num);
                    break;
            }


            command = scanner.nextLine();

        }

        printFinalStateList(numbers);
        System.out.println();




    }

    private static void printFinalStateList(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
