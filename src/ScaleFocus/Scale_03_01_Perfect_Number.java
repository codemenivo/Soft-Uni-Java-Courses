package ScaleFocus;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Scale_03_01_Perfect_Number {
    public static void main(String[] args) {

        /* Перфектното число е позитивно цяло число, което е равно на сумата от положителните си делители.
        *  Напишете програма, която намира първите 5 / 10 / 15 перфектни числа.
        * */

        // Това решение показва първите 4-ри резултата след които изчисляването е много дълго - Търсим друг Вариант!
        /*int counter = 1;
        long sum = 0;
        long index = 0;

        while (counter != 16) {

            for (long i = 1 + index; i < Integer.MAX_VALUE; i++) {
                long currentNum = i;
                for (long j = 1; j <= currentNum / 2; j++) {
                    if (currentNum % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.printf("%d%n", sum);
                    index = sum;
                    sum = 0;
                    break;
                }
                sum = 0;
            }


            counter++;
        } */

        int counter = 1;
        List<Integer> primeNumbers = new ArrayList<>();
        int firstPrime = 2;
        primeNumbers.add(firstPrime);


        for (int currentNum = 3; currentNum <= Integer.MAX_VALUE ; currentNum++) {
            boolean isPrime = true;
            if (currentNum == 3) {
                isPrime = true;
            } else  if (currentNum % 2 == 0) {
                isPrime = false;
                //continue;
            } else {
                for (int i = 3; i <= Math.sqrt(currentNum) ; i += 2) {
                    if (currentNum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeNumbers.add(currentNum);

            }

            if (primeNumbers.size() == 15){
                break;
            }
        }

        BigDecimal perfectNum ;
        //BigInteger base = new BigInteger("2");
        for (int index = 0; index < 15; index++) {
            int num = primeNumbers.get(index);
            perfectNum = new BigDecimal(Math.pow(2, num - 1) * (Math.pow(2,num) - 1));
            //BigInteger perf = base.pow(num - 1).multiply (base.pow(num).subtract(new BigInteger("1")));

            System.out.println(perfectNum);
            System.out.println();
            //System.out.println(perf);
            //System.out.println(); // Представяне на Изчисленията и Резултата с BigInteger
        }



    }
}
