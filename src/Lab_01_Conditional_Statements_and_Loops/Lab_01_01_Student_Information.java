package Lab_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Lab_01_01_Student_Information {
    public static void main(String[] args) {
        //На входа получавате на три реда с информация за студент - Име, Възраст, Среден Успех. Напишете програма,
        // която принтира информацията за студента в следният формат:
        //"Name: {student name}, Age: {student age}, Grade: {student grade}".

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avScore = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, avScore);



    }
}
