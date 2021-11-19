package Lab_02_Data_Types_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class Lab_2_03_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        //Напишете програма, която намира сумата на "n" на брой числа. На първият ред ще получите числото "n", а на
        // следващите редове самите числа. Принтирайте точната сума без да закръгляте.

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < number; i++) {
            BigDecimal digit = new BigDecimal(scanner.nextLine());
            sum = sum.add(digit);
        }
        System.out.println(sum);




    }
}
