package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_04_Print_and_Sum {
    public static void main(String[] args) {
        //Напишете програма, която извежда числата от дадено стартово число до дадено крайно число и принтира
        // тяхната сума. Всички числа ще са цели. На входа на първия ред ще е стартовото число, на втори ред ще е
        // крайното. Изхода да е на два реда - първи ред изписани числата от стартовото до крайното включително,
        // разделени с интервал, а на вторият Сумат във формат Sum: {Sum}

        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNum; i <= endNum ; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("%nSum: %d%n", sum);




    }
}
