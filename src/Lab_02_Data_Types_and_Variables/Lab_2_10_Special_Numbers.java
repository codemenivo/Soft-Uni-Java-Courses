package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_10_Special_Numbers {
    public static void main(String[] args) {
        //Специални числа са тези, на които сумата от цифрите им е равна на 5, 7 или 11. Напишете програма, която
        // получава цяло число "n"  и за чиалата от 1 до "n" определя, коиса специални. Изхода да е във формат
        // number and if it is special or not (True / False). number -> True / False

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int newNumber = 1; newNumber <= number ; newNumber++) {
            int sumDigits = 0;
            int currentNumber = newNumber;
            while (currentNumber != 0) {

                int lastDigit = currentNumber % 10;
                sumDigits += lastDigit;


                currentNumber /=10;
            }
            if ((sumDigits == 5) || (sumDigits == 7) || (sumDigits == 11)) {
                System.out.printf("%d -> True%n", newNumber);
            } else {
                System.out.printf("%d -> False%n", newNumber);
            }

        }




    }
}
