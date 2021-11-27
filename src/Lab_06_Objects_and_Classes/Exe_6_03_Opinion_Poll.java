package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_6_03_Opinion_Poll {
    public static void main(String[] args) {
        /* Направете клас "Person" и напишете програма, която чете от конзолата "N" на брой реда с персонални данни.
        * Принтирайте информацията за всички хора, чиято възраст е по голяма от 30 години, като ги подредите по
        * азбучен ред. Note: you can use stream() to filter people.
        * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> personality = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] personalInfo = scanner.nextLine().split("\\s+");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                personality.add(person); //другият вариант е със Stream филтрацията.
            }
        }

        // Stream - филтрация на хората по възраст и презаписване на обектите в листа според условието.
        //personality = personality.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        personality.sort(Comparator.comparing(Person::getName));

        for (Person person : personality) {
            //System.out.printf("%s - %d%n", person.getName(), person.getAge());
            //Или Втори вариант с оварайд на метода toString  в класа.
            System.out.println(person.toString());
        }

    }
}

