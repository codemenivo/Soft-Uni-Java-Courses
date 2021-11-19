package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_01_Age {
    public static void main(String[] args) {
        //Напишете програма, която определя дали въз основа на дадена възраст е човек: бебе, дете, тийнейджър,
        // възрастен, възрастен. Границите са: 0-2 – baby ;  3-13 – child ; 	14-19 – teenager ;  20-65 – adult ;
        // >=66 – elder;

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 66) {
            System.out.println("elder");
        } else if (age >= 20) {
            System.out.println("adult");
        } else if (age >= 14) {
            System.out.println("teenager");
        } else if (age >=3) {
            System.out.println("child");
        } else if (age >= 0) {
            System.out.println("baby");
        }




    }
}
