package ScaleFocus;

import java.util.Scanner;

public class Scale_01_01_Swap_Two_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.printf("a = %d%nb = %d%n",a, b);



    }
}
