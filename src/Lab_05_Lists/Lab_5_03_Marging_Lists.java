package Lab_05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_03_Marging_Lists {
    public static void main(String[] args) {
        /* На входа на два отделни реда ще получите два списъка със числа. Създайте резултантен списък, който съдържа
         * елементите на двата списъка, като първият елемент на новият списък ще е първият елемент от първият списък,
         * вторият елемент на обобщеният списък е първият елемент от вторият списък и т.н. Ако дължината на двата
         * списъка не е еднаква, тогава добавете останалите елементи на по големият списък в общият.
         * */

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = new ArrayList<>();
        String[] input2 = scanner.nextLine().split("\\s+");
        for (String strNum : input2) {
            secondList.add(Integer.parseInt(strNum));
        }

        if (Math.min(firstList.size(), secondList.size()) == firstList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                int currentNum = firstList.get(i);
                secondList.add((2 * i), currentNum);
            }
            printRefactoringList(secondList);
        } else {
            for (int i = 0; i < secondList.size(); i++) {
                int currentNum = secondList.get(i);
                firstList.add((2 * i) + 1, currentNum);
            }
            printRefactoringList(firstList);
        }


    }


    private static void printRefactoringList(List<Integer> listOfNumbers) {
        for (Integer number : listOfNumbers) {
            System.out.printf("%d ", number);
        }
    }




}