package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_03_Vacation {
    public static void main(String[] args) {
        //Дадена ви е група хора, тип група, в кой ден от седмицата те ще отседнат. Въз основа на тази информация
        // изчислете колко трябва да платят и отпечатайте тази цена на конзолата. Използвайте таблицата по-долу.
        // Обявените цени са за един човек. Резултатът трябва да изглежда така: "Total price: {price}". Цената трябва
        // да е форматирана до вторият десетичен знак.
        // Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
        // Business – if the group is bigger than or equal to  100 people 10 of them can stay for free.
        // Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
        // 	          Friday   	  Saturday	   Sunday
        //Students	     8.45	     9.80	    10.46
        //Business	    10.90	    15.60	    16
        //Regular	    15	        20	        22.50

        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.0;

        if ("Friday".equals(dayOfWeek)) {
            switch (typeOfGroup) {
                case "Students": {
                    price = numberOfPeople * 8.45;
                    if (numberOfPeople >= 30) {
                        price *= 0.85;
                    }
                }
                break;
                case "Business": {
                    price = numberOfPeople * 10.90;
                    if (numberOfPeople >= 100) {
                        price -= (10 * 10.90);
                    }
                }
                break;
                case "Regular": {
                    price = numberOfPeople * 15;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            }
        } else if ("Saturday".equals(dayOfWeek)) {
            switch (typeOfGroup) {
                case "Students": {
                    price = numberOfPeople * 9.80;
                    if (numberOfPeople >= 30) {
                        price *= 0.85;
                    }
                }
                break;
                case "Business": {
                    price = numberOfPeople * 15.60;
                    if (numberOfPeople >= 100) {
                        price -= (10 * 15.60);
                    }
                }
                break;
                case "Regular": {
                    price = numberOfPeople * 20;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            }
        } else if ("Sunday".equals(dayOfWeek)) {
            switch (typeOfGroup) {
                case "Students": {
                    price = numberOfPeople * 10.46;
                    if (numberOfPeople >= 30) {
                        price *= 0.85;
                    }
                }
                break;
                case "Business": {
                    price = numberOfPeople * 16.00;
                    if (numberOfPeople >= 100) {
                        price -= (10 * 16.00);
                    }
                }
                break;
                case "Regular": {
                    price = numberOfPeople * 22.50;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        price *= 0.95;
                    }
                }
                break;
            }
        }
        System.out.printf("Total price: %.2f%n", price);


    }
}
