package Lab_05_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_07_Remove_Negatives_And_Reverse {
    public static void main(String[] args) {
        /* Прочетете списък отцели числа. Премахнете всички отрицателни числа от списъка и принтирайте останалите
        * елементи в обратен ред. В случай, че няма останали елементи в списъка принтирайте "empty".
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(numbers);

        removeNegativeNumbers(numbers);

        printRefactoringList(numbers);
        System.out.println();

    }

    private static void printRefactoringList(List<Integer> numbers) {
        if (numbers.size() == 0) {
            System.out.println("empty");
        } else {
            for (Integer number : numbers) {
                System.out.printf("%d ", number);
            }
        }
    }

    private static void removeNegativeNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(numbers.get(i));
                i--;
            }
        }
    }
}
