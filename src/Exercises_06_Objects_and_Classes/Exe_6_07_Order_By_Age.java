package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exe_6_07_Order_By_Age {
    public static void main(String[] args) {
        /* За вход ще получавате неуточнен брой редове с информация. На всеки ред ще получавате масив с три елемента.
        *   - The first element will be string and represents the name of the person.
        *   - The second element will be a string and will represent the ID of the person.
        *   _ The last element will be an integer which represents the age of the person.
        *  Когато получите команда "End", спирате да получавате входни данни и трябва да се принтират всички хора
        * подредени спрямо годините във възходящ ред.
         * */

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Human> humansList = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] humanData = input.split("\\s+");
            String name = humanData[0];
            String id = humanData[1];
            int age = Integer.parseInt(humanData[2]);

            Human humanObj = new Human(name, id, age);
            humansList.add(humanObj);

            input = scanner.nextLine();
        }

        humansList.sort(Comparator.comparing(Human::getAge));

        for (Human human : humansList) {
            System.out.println(human.toString());
        }

    }


    static class Human {
        private String name;
        private String id;
        private int age;

        public Human(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
        }
    }


}
