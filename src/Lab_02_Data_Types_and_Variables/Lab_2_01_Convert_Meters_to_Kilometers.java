package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_01_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        //На входа на един ред ще получавате цело число, което е разтояния в метри. Напишете програма, която
        // преобразува метрите в километри. Форматирайте изхода до вторият знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        double distanceInKilometers = distanceInMeters / 1000.00;
        System.out.printf("%.2f%n", distanceInKilometers);




    }
}
