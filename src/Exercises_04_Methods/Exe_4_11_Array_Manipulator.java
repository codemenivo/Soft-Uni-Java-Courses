package Exercises_04_Methods;

import java.util.Scanner;

public class Exe_4_11_Array_Manipulator {
    public static void main(String[] args) {
        /* Входните данни ще се получават от конзолата. На първият ред ще се подаде масив от цели числа,
        * разделени едно от друго с интервал. На следващите редове до получаване на командата "end" ще се подават
        * команди за манипулиране на масива. Входните данни винаги ще бъдат валидни в описаният формат.
        * Не е нужно да ги проверявате изрично.
        *  Масивът може да бъде манипулиран от една от следните команди:
        *   •	exchange {index} – разделя масива след даденият индекс и променя подредбата на числата в него по
        *   начина показан в примера: E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3] Ако индекса е
        *   извън границите на масива отпечатайте "Invalid index".
        *   •	max even/odd – връща индекса на max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
        *   •	min even/odd – връща индекса на min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
        *       • Ако има два или повече равни min/max елемента, върнете индекса на най -десния.
        *       • Ако не може да намерите min/max even/odd елемент тогава отпечатайте "No matches".
        *   •	first {count} even/odd – връща първите {count} елемента -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
        *        • Ако {count} е по-голяма стойност от дължината на масива отпечатайте "Invalid count".
        *        • Ако няма достатъчно елементи, за да задоволите броя, отпечатайте колкото можете. Ако липсват
        *          even/odd елементи отпечатайте празен масив  "[]".
        *   •	end – прекратете въвеждането и отпечатайте крайното състояние на масива.
        *   Изход : Изходът трябва да се принтира на конзолата. На отделни редове отпечатвайте резултата от
        *   изпълнението на отделните команди. На последният ред принтирайте крайният масив в квадратни скоби,
        *   като елементите му са разделени със запетая и интервал.
        *   • Вижте примерите по-долу, за да разберете по-добре вашата задача.
        *   Ограничения:
        * •	The number of input lines will be in the range [2 … 50].
        * •	The array elements will be integers in the range [0 … 1000].
        * •	The number of elements will be in the range [1 ... 50]
        * •	The split index will be an integer in the range [-231 … 231 – 1]
        * •	first/last count will be an integer in the range [1 … 231 – 1]
        * •	There will not be redundant whitespace anywhere in the input
        * •	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB
        *
        * */

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }



        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] currentCommand = command.split("\\s+");
            String action = currentCommand[0];

            if ("exchange".equals(action)) {
                int indexRotation = Integer.parseInt(currentCommand[1]);
                numbers = getNewArrayNum(numbers, indexRotation);

            } else if ("max".equals(action)) {
                String operation = currentCommand[1];
                if ("even".equals(operation)) {
                    int evenIndex = getMaxEvenElementIndex(numbers);
                    if (evenIndex > -1) {
                        System.out.printf("%d%n", evenIndex);

                    } else {
                        System.out.println("No matches");
                    }
                } else {
                    int oddIndex = getMaxOddElementIndex(numbers);
                    if (oddIndex > -1) {
                        System.out.printf("%d%n", oddIndex);

                    } else {
                        System.out.println("No matches");
                    }
                }

            } else if ("min".equals(action)) {
                String operation = currentCommand[1];
                if ("even".equals(operation)) {
                    printMinEvenElementIndex(numbers);

                } else {
                    if ("odd".equals(operation)) {
                        printMinOddElementIndex(numbers);
                    }
                }

            } else if ("first".equals(action)) {
                int count = Integer.parseInt(currentCommand[1]);
                String operation = currentCommand[2];
                if (count > numbers.length) {
                    System.out.println("Invalid count");

                } else if ("even".equals(operation)) {
                    printOfFirstCountEvenDigits(numbers, count);

                } else if ("odd".equals(operation)) {
                    printFirstCountOddDigits(numbers, count);
                }

            } else if ("last".equals(action)) {
                int count = Integer.parseInt(currentCommand[1]);
                String operation = currentCommand[2];
                if (count > numbers.length) {
                    System.out.println("Invalid count");

                } else if ("even".equals(operation)) {
                    printOfLastCountEvenDigits(numbers, count);

                } else if ("odd".equals(operation)) {
                    printOfLastCountOddDigits(numbers, count);
                }
            }

            command = scanner.nextLine();
        }



            printFirstElements(numbers, numbers.length);




    }

    private static void printOfLastCountOddDigits(int[] numbers, int count) {
        int[] lastOddElements = new int[count];
        int counter = 0;
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 1) {
                lastOddElements[index] = currentNum;
                index++;
                counter++;
            }
            if (counter == count) {
                break;
            }
        }

        if (index == 0) {
            System.out.printf("[]%n");

        } else if (index == 1) {
            System.out.printf("[%d]%n", lastOddElements[0]);

        } else if (index > 1) {
            printLastDigits(lastOddElements, index);
        }

    }

    private static void printOfLastCountEvenDigits(int[] numbers, int count) {
        int[] lastEvenElements = new int[count];
        int counter = 0;
        int index = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0) {
                lastEvenElements[index] = currentNum;
                index++;
                counter++;
            }
            if (counter == count) {
                break;
            }
        }

        if (index == 0) {
            System.out.printf("[]%n");

        } else if (index == 1) {
            System.out.printf("[%d]%n", lastEvenElements[0]);

        } else if (index > 1) {
         printLastDigits(lastEvenElements, index);
        }

    }

    private static void printLastDigits(int[] lastEvenOrOddElements, int printIndex) {
        for (int k = printIndex - 1; k >= 0; k--) {
            if (k == printIndex - 1) {
                System.out.printf("[%d, ", lastEvenOrOddElements[k]);

            } else if (k < printIndex - 1 && k >= 1) {
                System.out.printf("%d, ", lastEvenOrOddElements[k]);

            } else if (k == 0) {
                System.out.printf("%d]%n", lastEvenOrOddElements[k]);

            }
        }
    }

    private static void printFirstCountOddDigits(int[] numbers, int count) {
        int[] firstOddElements = new int[count];
        int counter = 0;
        int index = 0;

        for (int currentNum : numbers) {
            if (currentNum % 2 == 1) {
                firstOddElements[index] = currentNum;
                index++;
                counter++;
            }
            if (counter == count) {
                break;
            }
        }

        if (index == 0) {
            System.out.printf("[]%n");

        } else if (index == 1) {
                    System.out.printf("[%d]%n", firstOddElements[0]);

        } else if (index > 1) {

           printFirstElements(firstOddElements, index);

        }
    }

    private static void printOfFirstCountEvenDigits(int[] numbers, int count) {
        int[] firstEvenElements = new int[count];
        int counter = 0;
        int index = 0;

            for (int i = 0; i < numbers.length; i++) {
                int currentNum = numbers[i];
                if (currentNum % 2 == 0) {
                    firstEvenElements[index] = currentNum;
                    index++;
                    counter++;
                }
                if (counter == count) {
                    break;
                }

            }

        if (index == 0) {
            System.out.printf("[]%n");

        } else if (index == 1) {
            System.out.printf("[%d]%n", firstEvenElements[0]);

        }  else if (index > 1) {

            printFirstElements(firstEvenElements, index);

        }


    }

    private static void printFirstElements(int[] firstEvenOrOddElements, int index) {
        for (int k = 0; k < index; k++) {
            if (k == 0) {
                System.out.printf("[%d, ", firstEvenOrOddElements[k]);

            } else if (k > 0 && k <= index - 2) {
                System.out.printf("%d, ", firstEvenOrOddElements[k]);

            } else if (k == index - 1){
                System.out.printf("%d]%n", firstEvenOrOddElements[k]);
            }
        }
    }

    private static void printMinOddElementIndex(int[] numbers) {
        int minOddElement = Integer.MAX_VALUE;
        int indexOfMinOddElement = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                if (numbers[i] <= minOddElement) {
                    minOddElement = numbers[i];
                    indexOfMinOddElement = i;
                }
            }
        }

        if (indexOfMinOddElement > -1) {
            System.out.printf("%d%n", indexOfMinOddElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static void printMinEvenElementIndex(int[] numbers) {
        int minEvenElement = Integer.MAX_VALUE;
        int indexOfMinEvenElement = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] <= minEvenElement) {
                    minEvenElement = numbers[i];
                    indexOfMinEvenElement = i;
                }
            }
        }

        if (indexOfMinEvenElement > -1) {
            System.out.printf("%d%n", indexOfMinEvenElement);
        } else {
            System.out.println("No matches");
        }
    }

    private static int getMaxOddElementIndex(int[] numbers) {
        int oddMax = Integer.MIN_VALUE;
        int indexOddMax = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                if (numbers[i] >= oddMax) {
                    oddMax = numbers[i];
                    indexOddMax = i;
                }
            }
        }
        return indexOddMax;
    }

    private static int getMaxEvenElementIndex(int[] numbers) {
        int evenMax = Integer.MIN_VALUE;
        int indexEvenMax = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (numbers[i] >= evenMax) {
                    evenMax = numbers[i];
                    indexEvenMax = i;
                }
            }
        }

        return indexEvenMax;
    }

    private static int[] getNewArrayNum(int[] numbers, int indexRotation) {
        int[] rotatedNumArr = new int[numbers.length];
        if (indexRotation < 0 || indexRotation >= numbers.length) {
            System.out.println("Invalid index");
            return numbers;
        } else {
            int newIndex = 0;
            for (int i = indexRotation + 1; i < numbers.length; i++) {
                rotatedNumArr[newIndex] = numbers[i];
                newIndex++;
            }

            for (int i = 0; i <= indexRotation; i++) {
                rotatedNumArr[newIndex] = numbers[i];

                newIndex++;
            }
            
        }
        return rotatedNumArr;
    }
}
