package Exercises_05_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Exe_5_07_Append_Arrays {
    public static void main(String[] args) {
        /* Напишете програма, която добвя различни масиви състоящи се от цели числа.
        *   •	Arrays are separated by "|"
        *   •	Values are separated by spaces (" ", one or several)
        *   •	Order the arrays from the last to the first, and their values from left to right
        * */

        Scanner scanner = new Scanner(System.in);
        List<String> simbols = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        Collections.reverse(simbols);

        System.out.println(simbols.toString().replace("[", "")
                                             .replace("]", "")
                                             .replaceAll(",", "")
                                             .trim()
                                             .replaceAll("\\s+", " "));


    }
}
