package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {

        // + - * / %

        // int divided by int will generate int answer
        //double divided by int will generate larger data type double
        // larger datatype, which has larger range will always win

        System.out.println( 5/2 );

        System.out.println( 5.0/2 );

        System.out.println( 5.0/2f );

        // 5 divided by 2 is 2 and remainder is 1

        System.out.println( 5.0 % 2); // 2*2 + 1

        System.out.println( 99 % 10); // 9*10 + 9

        System.out.println( 100 % 10); // no remainder


      // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
      // print the result in x hour y minutes format
      // for example 135 minutes, 2 hours 15 minutes




       // System.out.println("What is the time in minutes in whole number");

        //int minutes = 135 ;

        //int hourPart = 135/60;
        //int minsPart = 135%60;

        //System.out.println("The minutes " +minutes + " is " + hourPart + " hours and " + minsPart + " minutes.");



          Scanner input = new Scanner(System.in);

        System.out.println("What is the time in minutes in whole number?");
        int minutes = input.nextInt();

        int hourPart = minutes / 60;
        int minutePart = minutes % 60;

        System.out.println("The minutes " +minutes + " is " + hourPart + " hours and " + minutePart + " minutes.");

    }
}
