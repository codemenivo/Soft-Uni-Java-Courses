package Exercises_01_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Exe_1_05_Login {
    public static void main(String[] args) {
        //На входа ще получите стринг, който е "username". Паролата е "username", но изписан в обратен ред. Докато не
        // получите коректна парола принтирайте "Incorrect password. Try again.". Когато получите коректната парола,
        // принтирайте "User {username} logged in." . Освен това, ако на четвъртият опит паролата все още не е вярна,
        // принтирайте "User {username} blocked!"  и програмата трябва да приключи.

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        int counter = 1;
        String pass = "";
        StringBuilder reversUsername = new StringBuilder();
        reversUsername.append(username);
        reversUsername.reverse();
        String passWord = reversUsername.toString();

        while (counter <= 4) {
            pass = scanner.nextLine();
            if (passWord.equals(pass)) {
                System.out.printf("User %s logged in.%n", username);
                return;
            } else if (counter == 4){
                System.out.printf("User %s blocked!%n", username);
                return;

            } else {
                System.out.printf("Incorrect password. Try again.%n");
            }


            counter++;
        }




    }
}
