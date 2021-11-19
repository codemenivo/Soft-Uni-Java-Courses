package Lab_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_5_02_Gauss_Trick {
    public static void main(String[] args) {
        /* Напишете програма, която сумира всички подадени числа на входа в определен ред и ги подрежда в списък.
        * Редът на сумиране е : first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
        * Принтирайте списъка на сумите.
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());

        int iterSize = numbers.size() / 2;
        for (int i = 0; i < iterSize; i++) {
            numbers.set(i, (numbers.get(i) + numbers.get(numbers.size() - 1)));
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }

    }
}
