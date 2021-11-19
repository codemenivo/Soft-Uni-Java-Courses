package Lab_03_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab_3_04_Reverse_Array_of_Strings {
    public static void main(String[] args) {
        /* Напишете програма за четене на масив от низове, обърнете и отпечатване на неговите елементи.
        *  Входът се състои от последователност от низове, разделени с интервал.
        *  Отпечатайте изхода на един ред (разделен с интервал).
        * */

        Scanner scanner = new Scanner(System.in);

        String[] inputArr =  scanner.nextLine().split("\\s+");

        for (int i = 0; i < (inputArr.length / 2); i++) {
            String temp = "";
            temp = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = temp;
        }

        /* Вариант 1 Loop ForEach
        for (String element : inputArr) {
            System.out.printf("%s ", element);

        }
        */

        // Вариант 2 - метод String.join()
        System.out.println(String.join(" ", inputArr));


    }
}
