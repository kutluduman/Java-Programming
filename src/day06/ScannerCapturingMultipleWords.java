package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWords {

    public static void main(String[] args) {

        // System.out.println("What is your name?");

        //   String name = scan.nextLine();



        //     System.out.println("You have entered " + name);

        /*
         // Task 4
        // use nextLine to ask your bio
        // whats your name
        // which city you live in , including state , Tyson, VA
        // What is your street address



         */


       // Scanner scan = new Scanner(System.in);


        //System.out.println("Whats your name, city and street address including state?");

        //String bio = scan.nextLine();

        //System.out.println("This is your info : " + bio);


        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Which city do you live in including state?");
        String cityAndState = scan.nextLine();
        System.out.println("Your city is : " + cityAndState);

        System.out.println("What is your street address?");
        String address = scan.nextLine();
        System.out.println("Your address is : " + address);






    }


}
