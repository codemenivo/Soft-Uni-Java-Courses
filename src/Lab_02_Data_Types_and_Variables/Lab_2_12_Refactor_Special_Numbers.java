package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        //Ще получите работен код, който е решение на задача 9 от този Lab.
        // Променливите обаче са неправилно именувани, декларирани преди да са необходими и някои от тях се използват
        // за множество неща. Без да използвате предишното си решение, променете кода, така че да е лесен за
        // четене и разбиране.
        // Scanner scanner = new Scanner(System.in);
        // int kolkko = Integer.parseInt(scanner.nextLine());
        // int obshto = 0;
        // int takova = 0;
        // boolean toe = false;
        // for (int ch = 1; ch <= kolkko; ch++) {
        //    takova = ch;
        //    while (ch > 0) {
        //        obshto += ch % 10;
        //        ch = ch / 10;
        //    }
        //    toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
        //    System.out.printf("%d -> %b%n", takova, toe);
        //    obshto = 0;
        //    ch = takova;
        // }

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        for (int digit = 1; digit <= number ; digit++) {

            int sum = 0;
            int num = digit;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if ((sum == 5) || (sum == 7) || (sum == 11)) {

                System.out.printf("%d -> True%n", digit);
            } else {
                System.out.printf("%d -> False%n", digit);
            }
        }




    }
}
