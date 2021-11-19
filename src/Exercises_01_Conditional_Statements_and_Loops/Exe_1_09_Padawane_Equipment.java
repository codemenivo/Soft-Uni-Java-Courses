package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_09_Padawane_Equipment {
    public static void main(String[] args) {
        //Йода трябва да закупи снаражение за новата академия на Джадаите. Броя на елементите от снаражението е в
        // зависимост от броя студенти, които ще се запишат. Екипировката се състои от : lightsabers, belts and robes.
        // Ще ви бъде дадена сумата, която Джордж Лукас има, броят на учениците и цените на всеки артикул.
        // Трябва да помогнете на Джордж Лукас да изчисли дали парите, с които разполага, са достатъчни за закупуване
        // на цялото оборудване или колко още пари му трябват. Понякога lightsabres се счупват трябва да се купи с
        // 10% повече, закръглено до следващото цяло число. Също така, всеки шести колан е безплатен. Входните данни
        // ще се четат от конзолата и те ще съдържат на точно 5 реда.
        // - Количеството пари, които Джордж Лукас има - floating-point number in range [0.00…1,000.00]
        // - Брой на учениците - integer in range [0…100]
        // - Цената на lightsabers  за една сабя - floating-point number in range [0.00…100.00]
        // - Цената на халатите за една роба - floating-point number in range [0.00…100.00]
        // - Цената на коланите за един колан - floating-point number in range [0.00…100.00]
        // Входните данни винаги ще бъдат валидни. Не е необходимо да го проверявате изрично.
        // Изхода трябва да се принтира на конзолата. Ако изчислената цена на оборудването е по-малка или равна на
        // парите, които Джордж Лукас има:
        // - "The money is enough - it would cost {the cost of the equipment}lv."
        // Ако изчислената цена на оборудването е повече от парите, които Джордж Лукас има:
        // -  "George Lucas will need {neededMoney}lv more."
        // Всички цени трябва да бъдат закръглени до две цифри след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceSingleSaber = Double.parseDouble(scanner.nextLine());
        double priceSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceSingleBelt = Double.parseDouble(scanner.nextLine());

        double allSabres = Math.ceil(countOfStudents + (countOfStudents * 0.1));
       int numberFreeBelts = countOfStudents / 6;
       int numbersOfBelts = countOfStudents - numberFreeBelts;
       double moneyOfEquipment = (priceSingleSaber * allSabres) + (priceSingleRobe * countOfStudents)
                                    + (priceSingleBelt * numbersOfBelts);
       if (amountOfMoney >= moneyOfEquipment) {
           System.out.printf("The money is enough - it would cost %.2flv.%n", moneyOfEquipment);
       } else {
            double neededMoney = moneyOfEquipment - amountOfMoney;
           System.out.printf("George Lucas will need %.2flv more.%n", neededMoney);
       }




    }
}
