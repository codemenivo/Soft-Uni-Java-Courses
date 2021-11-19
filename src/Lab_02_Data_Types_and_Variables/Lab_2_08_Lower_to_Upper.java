package Lab_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Lab_2_08_Lower_to_Upper {
    public static void main(String[] args) {
        // Напишете програма, която определя кой символ е в горен регистър и кой е в долен. На конзолата да се
        // юизведе съобщение : upper-case or lower-case.

        Scanner scanner = new Scanner(System.in);
        char simbol = scanner.nextLine().charAt(0);

      //  if ((simbol >= 65) && (simbol <= 90)) {
      //      System.out.println("upper-case");
      //  } else if ((simbol >= 97) && (simbol <= 122)) {
      //      System.out.println("lower-case");
      //  }

        //Вриант 2
        String result = "";
        if (simbol >= 'A' && simbol <= 'Z') {
            result = "upper-case";
        } else  if (simbol >= 'a' && simbol <= 'z') {
            result = "lower-case";
        }

        System.out.println(result);




    }
}
