package Exercises_06_Objects_and_Classes;

import java.util.Scanner;

public class Exe_6_02_Articles {
    public static void main(String[] args) {
        /* Създайте клас "Article" със следните полета:
        *   •	Title – a string
        *   •	Content – a string
        *   •	Author – a string
        * Класът трябва да има конструктор и следните методи :
        *   •	Edit (new content) – change the old content with the new one
        *   •	ChangeAuthor (new author) – change the author
        *   •	Rename (new title) – change the title of the article
        *   •	override ToString – print the article in the following format: "{title} - {content}:{author}"
        * Напишете програма, която чете статия в следния формат : "{title}, {content}, {author}".
        * На следващият ред ще получите число "n". На следващите "n" реда ще получавасте по една от следните команди:
        * "Edit: {new content}"; "ChangeAuthor: {new author}"; "Rename: {new title}".
        * На края отпечатайте окончателната статия.
        * */

        Scanner scanner = new Scanner(System.in);
        String[] articleData = scanner.nextLine().split(",\\s+");

        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Article article = new Article(title, content, author);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String[] commandData = scanner.nextLine().split(": ");
            String commandName = commandData[0];
            String commandParameter = commandData[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParameter);
                    break;

                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;

                case "Rename":
                    article.rename(commandParameter);
                    break;
            }
        }

        System.out.println(article);

    }
}
