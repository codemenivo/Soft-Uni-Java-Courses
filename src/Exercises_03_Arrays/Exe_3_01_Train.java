package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_01_Train {
    public static void main(String[] args) {
        /* Ще ви бъде даден брой вагони n във влак. На следващите n реда ще получите колко хора ще се качат във
        *  вагоните на влака. На изхода отпечатайте на един ред броят на хората във всеки вагон разделени с интервал и
        *  на втори ред общият брой пътници във влака.
        * */

        Scanner scanner = new Scanner(System.in);
        int numberWagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int[] numberPeople = new int[numberWagons];
        for (int i = 0; i < numberWagons; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            numberPeople[i] = peopleInWagon;
            sum += peopleInWagon;
        }

        for (int numberPerson : numberPeople) {
            System.out.printf("%d ", numberPerson);
        }
        System.out.println();
        System.out.printf("%d%n", sum);



    }
}
