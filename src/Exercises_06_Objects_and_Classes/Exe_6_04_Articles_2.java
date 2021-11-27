package Exercises_06_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exe_6_04_Articles_2 {
    public static void main(String[] args) {
        /* Променете втора задача от това упражнение. Трябва да се сортира списъкът от статии (list of articles).
        * Няма да са нужни повече методи с изключение на (except the ToString method). На първият ред ще получите
        * цяло число "n" . На следващите "n" ще получите няколко статии в следният формат :
        * ("{title}, {content}, {author}"). На края ще получите една от трите думи : "title", "content", "author".
        * Трябва да подредите статиите по азбучен ред на базата на командата и да ги отпечатате сортирани
        *  по зададените критерии.
         * */

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Article_2> articles_2List = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] articleData = scanner.nextLine().split(",\\s+");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];

            Article_2 article_2 = new Article_2(title, content, author);
            articles_2List.add(article_2);
        }

        String command = scanner.nextLine();
        switch (command) {
            case "title":
                sortByThisCommand(articles_2List, command);
                break;

            case "content":
                sortByThisCommand(articles_2List, command);
                break;

            case "author":
                sortByThisCommand(articles_2List, command);
                break;
        }

        for (Article_2 article_2 : articles_2List) {
            System.out.println(article_2.toString());
        }

    }

    private static void sortByThisCommand(List<Article_2> articles_2List, String command) {
        if ("title".equals(command)) {
            articles_2List.sort(Comparator.comparing(Article_2::getTitle));
        } else if ("content".equals(command)) {
            articles_2List.sort(Comparator.comparing(Article_2::getContent));
        } else {
            articles_2List.sort(Comparator.comparing(Article_2::getAuthor));
        }
    }
}
