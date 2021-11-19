package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_04_Town_Info {
    public static void main(String[] args) {
        //На входа ще получите три реда с данни за даден град : на първият ред -> Името на града ;
        // На вторият -> броя на жителите ; На третият -> Площта на града. Използвайте подходящият тип данни и
        // принтирайте информацията във формата :
        // "Town {town name} has population of {population} and area {area} square km".

        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.%n", townName, population, area);


    }
}
