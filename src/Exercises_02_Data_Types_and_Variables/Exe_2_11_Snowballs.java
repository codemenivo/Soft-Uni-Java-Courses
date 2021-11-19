package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_11_Snowballs {
    public static void main(String[] args) {
        //Тони и Анди обичат да играят на сняг и да се бият със снежни топки, но винаги спорят кои са най-добрите
        // снежни топки. Те са решили да ви въвлекат в битката, като ви накарат да напишете програма, която изчислява
        // данните за снежната топка и извежда най-добрата стойност на снежната топка.
        // Ще получите N - цяло число, броят на партидите снежни топки, направени от Тони и Анди.
        //За всяка снежна топка ще получите 3 реда входни данни.
        // • На първия ред ще получите броят на снежните топки в една от партидите     snowballSnow - цяло число.
        // • На втория ред ще получите времето за изработка на една топка от партидата snowballTime - цяло число.
        // • На третия ред ще получите качеството на топка от партидата                snowballQuality - цяло число.
        // За всяка снежна топка трябва да изчислите нейната снежна стойност snowballValue по следната формула:
        // (snowballSnow / snowballTime) ^ snowballQuality
        // В края трябва да отпечатате най-високата изчислена стойност на снежната топка.
        // • На първия ред за въвеждане ще получите N - броят на снежните топки.
        // • На следващите N * 3 реда за въвеждане ще получавате данни за снежни топки.
        // • Като изход трябва да отпечатате най-високата изчислена стойност на снежна топка, по формулата, посочена по-горе.
        //• Изходният формат е:
        //{snowballSnow}: {snowballTime} = {snowballValue} ({snowballQuality}) 
        // Ограничения : 
        // • Броят на снежните топки (N) ще бъде цяло число в диапазон [0, 100].
        // • SnowballSnow е цяло число в диапазон [0, 1000].
        // • SnowballTime е цяло число в обхват [1, 500].
        // • SnowballQuality е цяло число в диапазон [0, 100].
        // • Разрешено работно време / памет: 100ms / 16MB.

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        long snowballValue = Integer.MIN_VALUE;
        int snowballQality = 0;
        int snowballTime = 0;
        int snowballSnow = 0;

        for (int series = 1; series <= number ; series++) {
            int currentSnowballSnow = Integer.parseInt(scanner.nextLine());
            int currentSnowballTime = Integer.parseInt(scanner.nextLine());
            int currentSnowballQuality = Integer.parseInt(scanner.nextLine());

            long currentSnowValue = (long) Math.ceil
                    ( Math.pow(currentSnowballSnow * 1.0/ currentSnowballTime, currentSnowballQuality * 1.0));
            if (currentSnowValue > snowballValue) {
                snowballValue = currentSnowValue;
                snowballQality = currentSnowballQuality;
                snowballTime = currentSnowballTime;
                snowballSnow = currentSnowballSnow;
            }

        }
        System.out.printf("%d : %d = %d (%d)", snowballSnow, snowballTime, snowballValue, snowballQality);


    }
}
