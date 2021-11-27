package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exe_6_01_Advertisement_Message {
    public static void main(String[] args) {
        /* Напишете програма, която генерира произволни рекламни съобщения за възхваляването на някой продукт.
        * Съобщението трябва да съдържа 4 части : laudatory phrase + event + author + city.
        * Използвайте следните предварително дефинирани части:
        *   •	Phrases – {"Excellent product.", "Such a great product.", "I always use that product.",
        * "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
        *   •	Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles.
        *  I am happy of the results!", "I cannot believe but now I feel awesome.",
        *  "Try it yourself, I am very satisfied.", "I feel great!"}
        *   •	Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
        *   •	Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
        * На изхода отпечатайте информацията във следният формат : {phrase} {event} {author} – {city}.
        * На входа ще получите цяло число, което ще показва броят на съобщенията, които трябва да се отпечатат.
        * Принтирайте всяко случайно  генерирано съобщение на отделен ред.
        * */

        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        int number = Integer.parseInt(scanner.nextLine());
        List<String> words = new ArrayList<>();

        while (number > 0) {
            addRandomWorrdsInList(words, phrases);
            addRandomWorrdsInList(words, events);
            addRandomWorrdsInList(words, authors);
            addRandomWorrdsInList(words, cities);

            for (int i = 0; i < words.size(); i++) {
                if (i < words.size() - 1) {
                    System.out.printf("%s ", words.get(i));
                } else {
                    System.out.printf("- %s%n", words.get(i));
                }
            }

            while (words.size() > 0) {
                words.remove(0);

            }

            number--;
        }


    }

    private static void addRandomWorrdsInList(List<String> words, String[] dataArr) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(dataArr.length);
        String randomWord = dataArr[randomIndex];
        words.add(randomWord);
    }
}
