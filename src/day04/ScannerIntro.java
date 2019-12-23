package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step 1: Use scanner class to create scanner object
                    // that have this functionality

        Scanner scan = new Scanner(System.in);

        // ask user to enter name (question)

        System.out.println("Enter your first name please?");

        // capture what user typed on keyboard in console

        String firstName = scan.next();

        // print the result of what we saved from user input

        System.out.println("You have entered: " + firstName);

    }


}
