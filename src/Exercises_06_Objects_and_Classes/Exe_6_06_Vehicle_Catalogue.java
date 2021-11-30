package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe_6_06_Vehicle_Catalogue {
    public static void main(String[] args) {
        /* Трябва да се направи автомобилен каталог. Ще получавате два вида автомобили -  - car or truck. Докато не
        * получите командата "End", на всеки ред ще получавате входна информация във формат :
        * {typeOfVehicle} {model} {color} {horsepower}
        * След командата "End", ще започнете да получавате модели автомобили (models of vehicles). Отпечатайте всеки
        * получен автомобил със неговите данни във формата :
        *   Type: {typeOfVehicle}
        *   Model: {modelOfVehicle}
        *   Color: {colorOfVehicle}
        *   Horsepower: {horsepowerOfVehicle}
        * Когато получите команда "Close the Catalogue", спирате да получавате входна информация и отпечатайте :
        * average horsepower for the cars and for the trucks in the format:
        *   "{typeOfVehicles} have average horsepower of {averageHorsepower}."
        * The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by
        * the total count of vehicles from the same type. Format the answer to the 2nd decimal point.
        * Ограничения:
        *   •	The type of vehicle will always be car or truck
        *   •	You will not receive the same model twice
        *   •	The received horsepower will be integer in the interval [1…1000]
        *   •	You will receive at most 50 vehicles
        *   •	Single whitespace will be used for separator
         * */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(input)) {
            String[]vehicleData = input.split("\\s+");
            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            int horsepower = Integer.parseInt(vehicleData[3]);

            Vehicle vehicleObj = new Vehicle(type, model, color, horsepower);
            vehicles.add(vehicleObj);

            input = scanner.nextLine();
        }

        String modelName = scanner.nextLine();
        while (!"Close the Catalogue".equals(modelName)) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(modelName)) {
                    if (vehicle.getType().equals("car")) {
                        vehicle.setType("Car");
                    } else {
                        vehicle.setType("Truck");
                    }
                    System.out.println(vehicle);
                }
            }

            modelName = scanner.nextLine();
        }

        int sumCarsHorsepower = 0;
        int sumTruckHorsepower = 0;
        int counterCars = 0;
        int counterTrucks = 0;
        for (Vehicle vehicleByType : vehicles) {
            if (vehicleByType.getType().equals("Car") || vehicleByType.getType().equals("car")) {

                sumCarsHorsepower += vehicleByType.getHorsepower();
                counterCars++;

            } else if (vehicleByType.getType().equals("Truck") || vehicleByType.getType().equals("truck")) {

                sumTruckHorsepower += vehicleByType.getHorsepower();
                counterTrucks++;
            }
        }



        if (counterCars == 0) {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        } else {
            double averageCarHorsepower = sumCarsHorsepower / (counterCars * 1.0);
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsepower);
        }

        if (counterTrucks == 0) {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        } else {
            double averageTruckHorsepower = sumTruckHorsepower / (counterTrucks * 1.0);
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsepower);
        }



    }


}
