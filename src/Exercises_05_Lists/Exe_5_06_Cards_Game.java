package Exercises_05_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_06_Cards_Game {
    public static void main(String[] args) {
        /* Ще получите две ръце от карти, които представляват цели числа. Да приемем, че имате двама играчи.
        *  Трябва да разберете печелившото тесте и съответно победителя. Започва се от началото на двете ръце и се
        *  сравняват картите от едното тесте с картите от другото тесте на съответните позиции. Играчът с по-голяма
        * карта взема и двете карти и ги поставя на гърба на ръката си, като картата с по-малкият номер става последна,
        * а по-голямата карта предпоследна. Същевременно отнетата карта трябва да отпадне от тестете в което е била.
        * Ако картите на двамата играчи са с равни стойности - никой не печели и двете карти трябва да се премахнат от
        *  тестетата. Играта приключва, когато едно от тестетата остане без карти. Трябва да принтирате победителя
        *  на конзолота и сумата от останалите карти в тестето му във формата:
        * "Player {one/two} wins! Sum: {sum}" -> First player wins! Sum: {sum} / Second player wins! Sum: {sum}
         * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] line2 = scanner.nextLine().split("\\s+");
        List<Integer> player2 = new ArrayList<>();
        for (String element : line2) {
            player2.add(Integer.parseInt(element));
        }
        int size1 = player1.size();
        int size2 = player2.size();
        while (size1 != 0 && size2 != 0) {

            int currentCard1 = player1.get(0);
            int currentCard2 = player2.get(0);

            if (currentCard1 > currentCard2) {
                player1.add(currentCard1);
                player1.add(currentCard2);
                player1.remove(0);
                player2.remove(0);
            } else if (currentCard2 > currentCard1) {
                player2.add(currentCard2);
                player2.add(currentCard1);
                player2.remove(0);
                player1.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }

            size1 = player1.size();
            size2 = player2.size();
        }

        printWiner(player1, player2);


    }

    private static void printWiner(List<Integer> player1, List<Integer> player2) {
        int size1 = player1.size();
        int size2 = player2.size();
        int sum = 0;
        if (size1 > 0) {
            for (Integer element : player1) {
                sum += element;
            }
            System.out.printf("First player wins! Sum: %d%n", sum);
        } else {
            for (Integer element : player2) {
                sum += element;

            }
            System.out.printf("Second player wins! Sum: %d%n", sum);
        }
    }


}
