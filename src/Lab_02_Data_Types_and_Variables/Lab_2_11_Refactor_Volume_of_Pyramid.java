package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_11_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        //Получавате работен код, с който се изчислява обем на пирамида. Трябва да имате предвид, че
        // променливите надвишават оптималния си диапазон и имат неправилно именуване. Също така търсете променливи,
        // които имат многократно предназначение.
        // Scanner scanner = new Scanner(System.in);
        //double dul, sh, V = 0;
        //System.out.print("Length: ");
        //dul = Double.parseDouble(scanner.nextLine());
        //System.out.print("Width: ");
        //sh = Double.parseDouble(scanner.nextLine());
        //System.out.print("Height: ");
        //V = Double.parseDouble(scanner.nextLine());
        //V = (dul + sh + V) / 3;
        //System.out.printf("Pyramid Volume: %.2f", V);

        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double volume = 0;
        volume = (length * width * height) / 3;
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f%n", volume);





    }
}
