package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_08_Beer_Kegs {
    public static void main(String[] args) {
        //Напишете програма, която изчислява обема на "n" на брой кегове за бира. На входа ще получите "n * 3"
        // Всяка тройка линии ще съдържа информация за един кег. На първата линия ще е модела "model" на кеда,
        // на втората ще е радиусът "radius" на дъното на кега, на трети ред е височината "height" на кега.
        // Calculate the volume using the following formula: π * r^2 * h.  На изхода принтирайте
        // модела на кега с най-голям обем.
        // •	First – model – string.
        // •	Second –radius – floating-point number [1…3.402823E+38]
        // •	Third – height – integer number [1…2147483647]
        // •	n will be in the interval [1…10]

        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int kegs = 1; kegs <= inputNum ; kegs++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;

            }
        }
        System.out.printf("%s%n", maxModel);




    }
}
