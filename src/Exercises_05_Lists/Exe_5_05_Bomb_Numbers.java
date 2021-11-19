package Exercises_05_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exe_5_05_Bomb_Numbers {
    public static void main(String[] args) {
        /* Напишете програма, която чете на първият ред поредица от числа, а на вторият ред -
        * специаленото число на бомба и числото, което се определя нейната мощност.
        * Задачата е да се "взривяват" съседите отлявао и отдясно на числото на бомбата в съответствие
        * с нейната мощност (специаленото число на бомбата), като се започва винаги отляво на дясно и всички
        * взривени числа изчезват.
        * За изход принтирайте сумата на всички останали числа от дадената поредица.
        * */

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] information = scanner.nextLine().split("\\s+");
        int bombNum = Integer.parseInt(information[0]);
        int power = Integer.parseInt(information[1]);
        boolean isContainListBombNum = numbersList.contains(bombNum);

        while (isContainListBombNum) {
            numbersList = bombNeighborsNums(numbersList, bombNum, power);


            isContainListBombNum = numbersList.contains(bombNum);

        }

        int sum = calculateSumRemainingElementsList(numbersList);
        System.out.printf("%d%n", sum);

    }

    private static int calculateSumRemainingElementsList(List<Integer> numbersList) {
        int sumElements = 0;
        for (Integer num : numbersList) {
            sumElements += num;
        }
        return sumElements;
    }

    private static List<Integer> bombNeighborsNums(List<Integer> numbersList, int bombNum, int power) {
        numbersList = removeLeftNumbers(numbersList, bombNum, power);

        return numbersList;
    }

    private static List<Integer> removeLeftNumbers(List<Integer> numbersList, int bombNum, int power) {
        numbersList = removeRightNumbers(numbersList, bombNum, power);


        for (int indexL = 0; indexL < numbersList.size(); indexL++) {
            int currentNum = numbersList.get(indexL);

            if (currentNum == bombNum) {
                if (indexL == 0) {
                    numbersList.remove(indexL);
                    indexL--;

                } else if (indexL <= power) {
                    int subSize = indexL;
                    for (int i = 0; i <= subSize; i++) {
                        numbersList.remove(0);
                        indexL--;
                    }

                } else if (indexL > power) {
                    for (int i = indexL; i >= (indexL - power) ; i--) {
                        numbersList.remove(i);
                    }
                    indexL--;
                }
            }
        }

        return numbersList;
    }

    private static List<Integer> removeRightNumbers(List<Integer> numbersList, int bombNum, int power) {
        for (int indexR = 0; indexR < numbersList.size(); indexR++) {
            int currentNum = numbersList.get(indexR);

            if (currentNum == bombNum) {
                int subSize = numbersList.size() - (indexR + 1);
                if (subSize == 0) {
                    break;
                } else if (subSize > 0 && subSize < power) {
                    for (int i = 0; i < subSize; i++) {
                        numbersList.remove(indexR + 1);
                    }
                } else if (subSize >= power){
                    for (int i = 0; i < power; i++) {
                        numbersList.remove(indexR + 1);

                    }
                }

            }

        }

        return numbersList;
    }


}
