package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_10_Rage_Expenses {
    public static void main(String[] args) {
        //Когато Петър загуби игра, той в ядът си счупва компютърното си оборудване. Геймърското му оборудване
        //се състои от : headset, mouse, keyboard and display. Ще получите броя на загубените игри на Петър.
        // - На всяка Втора изгубена игра Петър троши -> headset.
        // - На всяка Трета изгубена игра троши -> mouse.
        // - Когато Петър счупва едновременно -> mouse and headset , той счупва и своята клавиатура -> keyboard .
        // - Всеки втори път когато счупва своята клавиатура, той счупва и дисплея -> keyboard,
        // he also trashes his display. Ще получите цените на всяка вещ от неговият геймърски комплект.
        // Изчислете неговите разходи за подновяване на игралното му оборудване.
        // •	On the first input line - lost games count – integer in the range [0, 1000].
        // •	On the second line – headset price - floating point number in range [0, 1000].
        // •	On the third line – mouse price - floating point number in range [0, 1000].
        // •	On the fourth line – keyboard price - floating point number in range [0, 1000].
        // •	On the fifth line – display price - floating point number in range [0, 1000].
        // На Изхода : •	As output you must print Peter`s total expenses: "Rage expenses: {expenses} lv."
        //             •	Allowed working time / memory: 100ms / 16MB.

        Scanner scanner = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int numberLostHeadset = lostGamesCount / 2;
        int numberLostMouse = lostGamesCount / 3;
        int numberLostKeyboard = lostGamesCount / 6;
        int numberLostDisplay = lostGamesCount / 12;

        double totalExpeses = (numberLostHeadset * headsetPrice) + (numberLostMouse * mousePrice)
                                + (numberLostKeyboard * keyboardPrice) + (numberLostDisplay * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.%n", totalExpeses);




    }
}
