package Exercises_05_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe_5_03_House_Party {
    public static void main(String[] args) {
        /* Напишете програма, която следи гостите, които отиват на домашно парти. На првата входналиния ще получите
        *  броят на командите, които ще постъпят. На следващите редове от входа ще получите някои от слвдните команди:
        *   •	"{name} is going!"
        *   •	"{name} is not going!"
        *  Ако получите първият вид команда - трябва да добавите името в списъка ако не е налично.
        *  Ако това име съществува в списъка отпечатайте "{name} is already in the list!" .
        *  Ако получите вторият тип команда - трябва да изтриете името от списъка ако е налично. В противен случай
        *  трябва да отпечатате : "{name} is not in the list!"
        * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            boolean isContain = isListContainName(names, command[0]);
            if ("going!".equals(command[2])) {
                if (isContain) {
                    System.out.printf("%s is already in the list!%n", command[0]);
                } else {
                    names.add(command[0]);
                }
            } else {
                if (!isContain) {
                    System.out.printf("%s is not in the list!%n", command[0]);
                } else {
                    names.remove(command[0]);
                }
            }
        }

        printIstNames(names);



    }

    private static void printIstNames(List<String> names) {
        for (String name : names) {
            System.out.printf("%s%n", name);
        }
    }

    private static boolean isListContainName(List<String> names, String name) {

        return names.contains(name);
    }
}
