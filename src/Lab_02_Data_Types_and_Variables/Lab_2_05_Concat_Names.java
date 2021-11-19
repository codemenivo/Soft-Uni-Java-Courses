package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_05_Concat_Names {
    public static void main(String[] args) {
        //На входа ще получите две имена и разделител. Те ще постъпват на отделни редове. Принтирайте именат
        // свързани с разделителя.

        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.printf("%s%s%s%n", name1, delimiter, name2);




    }
}
