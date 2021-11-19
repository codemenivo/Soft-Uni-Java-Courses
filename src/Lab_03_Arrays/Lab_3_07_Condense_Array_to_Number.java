package Lab_03_Arrays;

import java.util.Scanner;

public class Lab_3_07_Condense_Array_to_Number {
    public static void main(String[] args) {
        /* Напишете програма за четене на масив от цели числа и ги кондензирайте чрез сумиране на съседни двойки
        *  елементи, докато се получи едно цяло число.
        *  Например, ако имаме 3 елемента {2, 10, 3}, сумираме първите два и вторите два елемента и
        *  получаваме {2 + 10, 10 + 3} = {12, 13}, след това отново сумираме всички съседни елементи и се
        *  получава {12 + 13} = {25}.
        * */

        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");
        int[] numbers = new int[inputData.length];

        for (int input = 0; input < numbers.length; input++) {
            numbers[input] = Integer.parseInt(inputData[input]);
        }

        int sum = 0;

        if (numbers.length == 1) {
            sum = numbers[0];
        } else {
            while (numbers.length > 1) {
                int[] condense = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    condense[i] = numbers[i] + numbers[i + 1];
                }
                sum = condense[0];

                numbers = new int[condense.length];
                for (int num = 0; num < condense.length; num++) {
                    numbers[num] = condense[num];
                }

            }
        }

        System.out.printf("%d%n", sum);


    }
}
