package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_01_Train {
    public static void main(String[] args) {
        /* На първият ред на входа ще получите цели числа, които оразяват списъка с вагони. Тези цели числа показват
        *  броят на пътниците, които са във всеки вагон. На следващият ред ще получите едно цяло число, което отразява
        * максималният капацитет на броят пътници за всеки вагон. Докато получите команда "end" на входа ще получавате
        * два типа команди.
        *  •	Add {passengers} - add a wagon to the end with the given number of passengers
        *  •	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
        * За изход принтирайте финалното състояние на влака - броят пътници във всеки вагон отделени с инттервал.
         * */

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsWithPassengers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                                .map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] instruction = command.split("\\s+");
            if ("Add".equals(instruction[0])) {
                int passengers = Integer.parseInt(instruction[1]);
                addWagonWithPassengersToTrain(wagonsWithPassengers, passengers);
            } else {
                int newPassengers = Integer.parseInt(instruction[0]);
                addPassengersInwagonToCapacity(wagonsWithPassengers, newPassengers, capacity);
            }


            command = scanner.nextLine();
        }

        printWagonsWithPassengers(wagonsWithPassengers);


    }

    private static void printWagonsWithPassengers(List<Integer> wagonsWithPassengers) {
        for (Integer numberPassengers : wagonsWithPassengers) {
            System.out.printf("%d ", numberPassengers);

        }
        System.out.println();
    }

    private static void addPassengersInwagonToCapacity
                                (List<Integer> wagonsWithPassengers, int newPassengers, int capacity) {
        for (int i = 0; i < wagonsWithPassengers.size(); i++) {
            int currentPassengers = wagonsWithPassengers.get(i);
            if ((currentPassengers + newPassengers) <= capacity) {
                wagonsWithPassengers.set(i, (currentPassengers + newPassengers));
                break;
            }

        }
    }

    private static void addWagonWithPassengersToTrain(List<Integer> wagonsWithPassengers, int passengers) {
        wagonsWithPassengers.add(passengers);
    }
}
