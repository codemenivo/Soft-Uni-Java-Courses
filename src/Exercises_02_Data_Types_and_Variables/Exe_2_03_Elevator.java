package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_03_Elevator {
    public static void main(String[] args) {
        //Изчислете колко курса ще са необходими за издигане на n лица, като използвате асансьор с капацитет от p лица.
        //Входът съдържа два реда: броят на хората n и капацитетът p на асансьора.

        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int coursesElevator = 0;

        coursesElevator = (int)Math.ceil((double) numOfPeople / capacity);
        System.out.printf("%d%n", coursesElevator);




    }
}
