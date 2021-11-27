package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exe_6_05_Students {
    public static void main(String[] args) {
        /* Напишете програма, която приема "n" броя студенти (n count of students ) и ги подрежда според оценките в
        * нисходящ ред (in descending). За всеки студент информацията ще съдържа :
        * first name (string), last name (string) and grade (floating-point number).
        * Вход :
        *   •	First line will be a number n
        *   •	Next n lines you will get a student info in the format "{first name} {second name} {grade}"
        * Изход :   Print each student in the following format "{first name} {second name}: {grade}"
         * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String firstName = studentData[0];
            String secondName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);

            Student student = new Student(firstName, secondName, grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student studentObject : studentsList) {
            System.out.println(studentObject.toString());
        }

    }
}
