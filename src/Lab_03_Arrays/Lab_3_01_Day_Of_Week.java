package Lab_03_Arrays;

import java.util.Scanner;

public class Lab_3_01_Day_Of_Week {
    public static void main(String[] args) {
    // Въведете номер на ден [1… 7] и отпечатайте името на деня (на английски език) или „Invalid day!“.
    // Използвайте масив от низове.
    // •	Use an array of strings holding the day names: {"Monday", "Tuesday", "Wednesday", "Thursday",
    //                                                      "Friday", "Saturday", "Sunday"}.
    // •	Print the element at index (day-1) when it is in the range [1…7] or "Invalid Day!" otherwise.

        Scanner scanner = new Scanner(System.in);
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int dayNumber = Integer.parseInt(scanner.nextLine());

        if ((dayNumber < 1) || (dayNumber > 7)) {
            System.out.println("Invalid day!");
        } else {
            for (int i = 0; i < dayNumber; i++) {
                System.out.printf("%s%n", dayNames[dayNumber - 1]);
                break;

            }
        }


    }
}
