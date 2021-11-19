package Exercises_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exe_3_10_Lady_Bugs {
    public static void main(String[] args) {
        /* Получавате размер на полето и индексите на калинките в полето. След това на всеки нов ред, докато не бъде
        * дадена командата "end", калинка променя позицията си отляво или отдясно с определена дължина на полета.
        * Командата към калинка изглежда така:"0 right 1". Това означава, че малкото насекомо, поставено върху индекс 0,
        * трябва да лети с един индекс вдясно. Ако калинката кацне на друга калинка, тя продължава да лети в същата
        * посока със същата дължина на полета. Ако калинката излети извън полето, тя отлита. Например, представете си,
        * че ви е дадено поле с размер 3 и калинки на индекси 0 и 1. Ако калинката на индекс 0 трябва да отлети вдясно
        * с дължината 1 (0 right 1), тя ще се опита да кацне на индекс 1 но тъй като има друга калинка там, тя ще
        * продължи по-надясно с допълнителна дължина 1, кацайки на индекс 2. След това, ако същата калинка трябва
        * да лети вдясно с дължината 1 (2 right 1), ще кацне някъде извън полето, така ще отлети: Ако ви бъде даден
        * индекс на калинки, в който там няма калинка, нищо не се случва. Ако ви се даде индекс на калинка, който е
        * извън полето, нищо не се случва. Вашата задача е да създадете програмата, симулирайки калинките, които летят
        * наоколо, без да правят нищо. В края отпечатайте всички клетки в полето, разделени с празни интервали.
        * За всяка клетка, на която има калинка, отпечатайте „1“, а за всяка празна клетка отпечатайте „0“.
        * За горния пример изходът трябва да бъде „0 1 0“.
        * Вход : • На първия ред ще получите цяло число - размера на полето
        * Дадените индекси могат или не могат да бъдат в обхвата на полето !
        * • На втория ред ще получите първоначалните индекси на всички калинки, разделени с празно място.         *
        * • На следващите редове, докато не получите командата "end", ще получавате команди във формат:
        * "{ladybug index} {direction} {fly length}"
        *  Изход : • Отпечатайте всички клетки в полето във формат: "{cell} {cell} ... {cell}"
        *  • Ако в клетката има калинка, отпечатайте „1“
        *  • Ако клетката е празна, отпечатайте „0“
        *  Ограничения : • Размерът на полето ще бъде в диапазона [0 ... 1000]
        *  • Индексите на калинките ще бъдат в диапазона [-2,147,483,647 ... 2,147,483,647]
        *  • Броят на командите ще бъде в диапазона [0 ... 100]
        *  • Дължината на полета ще бъде в диапазона [-2,147,483,647 ... 2,147,483,647]
        * */

        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();
        int[] currentPosition = new int[fieldSize];

        for (int i = 0; i < fieldSize; i++) {
            for (int k = 0; k < indexes.length; k++) {
                int currentInitialIndex = indexes[k];
                if (currentInitialIndex == i) {
                    currentPosition[i] = 1;
                    break;
                }
            }
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] initialPositions = command.split("\\s+");
            int startIndex = Integer.parseInt(initialPositions[0]);
            String direction = initialPositions[1];
            int flyLength = Integer.parseInt(initialPositions[2]);
            int endIndex = 1001;

            if ((startIndex >= 0 && startIndex < currentPosition.length)
                    && currentPosition[startIndex] == 1) {

                switch (direction) {
                    case "right":
                        if (flyLength >= 0) {
                            endIndex = startIndex + flyLength;

                            if (endIndex >= currentPosition.length) {
                                currentPosition[startIndex] = 0;
                            } else if ((endIndex >= 0 && endIndex < currentPosition.length)) {
                                currentPosition[startIndex] = 0;
                                for (int stopFly = endIndex; stopFly < currentPosition.length; stopFly += flyLength) {
                                    if (currentPosition[stopFly] == 0) {
                                        currentPosition[stopFly] = 1;
                                        break;
                                    }
                                }
                            }
                        } else {
                            endIndex = startIndex - flyLength;

                            if (endIndex < 0) {
                                currentPosition[startIndex] = 0;
                            } else if (endIndex >= 0 && endIndex < currentPosition.length) {
                                currentPosition[startIndex] = 0;
                                for (int stopFly = endIndex; stopFly >= 0; stopFly -= flyLength) {
                                    if (currentPosition[stopFly] == 0) {
                                        currentPosition[stopFly] = 1;
                                        break;
                                    }
                                }
                            }
                        }

                        break;

                    case "left":
                        if (flyLength >= 0) {
                            endIndex = startIndex - flyLength;

                            if (endIndex < 0) {
                                currentPosition[startIndex] = 0;
                            } else if ((endIndex >= 0 && endIndex < currentPosition.length)) {
                                currentPosition[startIndex] = 0;
                                for (int stopFly = endIndex; stopFly >= 0; stopFly -= flyLength) {
                                    if (currentPosition[stopFly] == 0) {
                                        currentPosition[stopFly] = 1;
                                        break;
                                    }
                                }
                            }
                        } else {
                            endIndex = startIndex + Math.abs(flyLength);

                            if (endIndex >= currentPosition.length) {
                                currentPosition[startIndex] = 0;
                            } else if (endIndex >= 0 && endIndex < currentPosition.length) {
                                currentPosition[startIndex] = 0;
                                for (int stopFly = endIndex; stopFly < currentPosition.length; stopFly += flyLength) {
                                    if (currentPosition[stopFly] == 0) {
                                        currentPosition[stopFly] = 1;
                                        break;
                                    }
                                }
                            }
                        }

                        break;
                }
            }



            command = scanner.nextLine();
        }

        for (int digit : currentPosition) {
            System.out.printf("%d ", digit);
        }
        System.out.println();


    }
}
