package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_09_Spice_Must_Flow {
    public static void main(String[] args) {
        //Напишете програма, която изчислява общото количество подправки "total amount ", които могат да бъдат
        // извлечени от източника. Източникът има начален добив "starting yield", който показва, колко подправки,
        // могат да бъдат добити през първият ден. След всеки работен ден добивът спада с 10, което означав,
        // че на втория ден ще даде 10 подправки по-малко, отколкото на първия, на третия ден с 10 по-малко от втория
        // и т.н. (вижте примери) . Източник се счита за печеливш само докато добивът му е поне 100 - когато се очаква
        // по-малко от 100 подправки на ден, изоставете източника. Копаещият екип консумира 26 подправки всеки ден
        // в края на смяната си и още 26 след изчерпване на мината. Обърнете внимание, че работниците не могат
        // да консумират повече подправки, отколкото има на склад. Когато операцията приключи, отпечатайте на
        // конзолата на два отделни реда колко дни е работила мината и общото количество извлечена подправка.
        // На входа Ще получите число, представляващо началния добив на източника.
        // •	The starting yield will be a positive integer within range [0 … 2 147 483 647]

        Scanner scanner = new Scanner(System.in);
            int capacityYield = Integer.parseInt(scanner.nextLine());
            int dayCounter = 0;
            int totalAmount = 0;

            while (capacityYield >= 100) {
                totalAmount += (capacityYield - 26);
                dayCounter ++;
                capacityYield -= 10;
            }
        if (totalAmount >= 26) {
            totalAmount -= 26;
        } else {
            totalAmount = 0;
        }
        System.out.printf("%d%n%d%n", dayCounter, totalAmount);


    }
}
