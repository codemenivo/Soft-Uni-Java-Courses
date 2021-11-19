package Exercises_02_Data_Types_and_Variables;

import java.util.Scanner;

public class Exe_2_10_Poke_Mon {
    public static void main(String[] args) {
        //Poke Mon иска да води статистика за това, колко точки е успял да направи.
        //The Poke Mon пробожда целта си и след това продължава да пробожда друга цел. Разстоянието между целите
        // му намалява силата му. Ще ви бъде дадена мощност, която Poke Mon има,(poke power ) N - цяло число.
        // След това ще ви бъде дадено разстоянието между целите на мушкане, (distance) M - цяло число.
        // Тогава ще ви бъде даден (exhaustion Factor) Y - цяло число.
        // Вашата задача е да започнете да изваждате M от N, докато N стане по-малко от M, т.е. Poke Mon няма
        // достатъчно сила, за да достигне следващата цел. Всеки път, когато извадите M от N, това означава, че сте
        // достигнали дадена цел и сте я поразили успешно. БРОЙТЕ колко цели сте поразили - това ще ви трябва.
        // Poke Mon постепенно се изчерпва. АКО N стане равно на ТОЧНО 50% от първоначалната му стойност, трябва да
        // разделите N на Y, ако е ВЪЗМОЖНО.   Това ДЕЛЕНИЕ е между цели числа.
        //Ако разделянето не е възможно, НЕ трябва да го правите. Вместо това трябва да продължите да изваждате.
        // След разделяне трябва да продължите да изваждате от N, докато стане по-малко от М.
        // Когато N стане по-малко от M, трябва да вземете това, което е останало от N, и броя на целите,
        // които сте прокарали, и да ги отпечатате като изход.   ЗАБЕЛЕЖКА: Когато изчислявате проценти, трябва
        //да сте ТОЧНИ максимално.   Пример: 505 НЕ Е ТОЧНО 50% от 1000, неговите 50,5%.
        // • Входът се състои от 3 реда.
        // • На първия ред ще получите N - цяло число   range [1, 2.000.000.000]..
        // • На втория ред ще получите M - цяло число   range [1, 1.000.000].
        // • На третия ред ще получите Y - цяло число   range [0, 9].
        // •	Allowed time / memory: 16 MB / 100ms.
        // Изход :   • Резултатът се състои от 2 реда.
        //           • На първия ред отпечатайте останалото от N, след изваждане от него.
        //           • На втория ред отпечатайте броя на целите, които сте успели да прободете.

        Scanner scanner = new Scanner(System.in);
        int inputPokePower = Integer.parseInt(scanner.nextLine());
        int currentPoketPower = inputPokePower;
        int distancePoked = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int counterTargets = 0;



            while (currentPoketPower >= distancePoked) {

                    currentPoketPower -= distancePoked;
                    counterTargets++;

                    if (((currentPoketPower * 100.00) / inputPokePower == 50.00) && exhaustionFactor > 0) {
                        currentPoketPower /= exhaustionFactor;


                    }


            }

        System.out.printf("%d%n%d%n", currentPoketPower, counterTargets);


    }
}
