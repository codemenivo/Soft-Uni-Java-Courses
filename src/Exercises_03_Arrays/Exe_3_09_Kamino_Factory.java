package Exercises_03_Arrays;

import java.util.Scanner;

public class Exe_3_09_Kamino_Factory {
    public static void main(String[] args) {
        /* Клониращата фабрика в Камино получи още една заповед за клониране на войски. Но този път имате задачата
        *  да намерите най-добрата ДНК последователност, която да използвате в производството. Ще получите дължината
        *  на ДНК докато не получите командата "Clone them!". Ще получите ДНК последователности от единици и нули,
        *  разделени на "!" (един или няколко). Трябва да изберете последователността с най-дългата последователност
        *  от тях. Ако има няколко последователности с еднаква дължина на последователност от тях, отпечатайте тази
        *  с най-левия стартов индекс, ако има няколко последователности с еднаква дължина и стартов индекс,
        *  изберете последователността с по-голямата сума от нейните елементи. След като получите последната команда
        * "Clone them!" трябва да отпечатате събраната информация в следния формат:
        *  "Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
        *  "{DNA sequence, joined by space}"
        *  Вход : • Първият ред съдържа дължината на последователностите - цяло число в обхват [1… 100];
        *  На следващите редове, докато не получите "Clone them!" ще получавате последователности (поне една)
        *  от единици и нули, разделени на "!" (един или няколко).
        *  Изход : Резултатът трябва да бъде отпечатан на конзолата и се състои от два реда в следния формат:
        *  "Best DNA sample {bestSequenceIndex} with sum: {bestSequenceSum}."
        *  "{DNA sequence, joined by space}"
        * */

        Scanner scanner = new Scanner(System.in);

        int lengthSequences = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int bestRow = 0;
        int bestIndex = Integer.MAX_VALUE;
        int bestSumOfDigit_1 = 0;
        int bestDNA = 0;

        int currentRow = 0;
        String[] dna = new String[lengthSequences];

        while (!"Clone them!".equals(input)) {
            String [] strArr = input.split("!+");
            currentRow++;

            int sumOfDigit_1 = 0;
            for (int i = 0; i < strArr.length; i++) {

                if ("1".equals(strArr[i])) {
                    sumOfDigit_1++;
                }
            }


            for (int index = 0; index < strArr.length; index++) {
                int currentDNA = 0;
                int currentIndex = -1;

                if ("1".equals(strArr[index])) {
                    currentIndex = index;
                    currentDNA++; //currentDNA = 1;
                }

                for (int k = index + 1; k < strArr.length; k++) {
                    if (strArr[index].equals(strArr[k]) && currentIndex > -1) {
                        currentDNA++;
                    } else {
                        break;
                    }
                }

                if (currentDNA > bestDNA) {
                    bestRow = currentRow;
                    bestIndex = currentIndex;
                    bestSumOfDigit_1 = sumOfDigit_1;
                    bestDNA = currentDNA;

                    for (int i = 0; i < strArr.length; i++) {
                        dna[i] = strArr[i];
                    }
                } else if (currentDNA == bestDNA && currentIndex < bestIndex) {
                    bestRow = currentRow;
                    bestIndex = currentIndex;
                    bestSumOfDigit_1 = sumOfDigit_1;

                    for (int i = 0; i < strArr.length; i++) {
                        dna[i] = strArr[i];
                    }
                } else if (currentDNA == bestDNA && currentIndex == bestIndex) {
                    if (sumOfDigit_1 > bestSumOfDigit_1) {
                        bestRow = currentRow;
                        bestSumOfDigit_1 = sumOfDigit_1;

                        for (int i = 0; i < strArr.length; i++) {
                            dna[i] = strArr[i];
                        }
                    }
                }

            }

            input = scanner.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestRow, bestSumOfDigit_1);
        for (String element : dna) {
            System.out.printf("%s ", element);
        }

    }
}
