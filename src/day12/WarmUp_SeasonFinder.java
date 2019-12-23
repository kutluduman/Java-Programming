package day12;

import java.util.Scanner;

public class WarmUp_SeasonFinder {

    public static void main(String[] args) {


        /*

        Create a class called WarmUp_SeasonFinder :
        Create a variable called month with data type int
        And write an if else if else statement to do following
        If the month is less than 1 or more than 12 —>> INVALID MONTH
        If the month is between 3-5  print it's  spring
        If the month is between 6-8  print it's  summer
        If the month is between 9-11  print it's  fall
        If the month is 12,1,2  print it's  Winter!


         */


        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is the month right now ? ");

        int month = scan.nextInt();


        if (month<1 || month>12) {

            System.out.println("Invalid Month");


        } else if (month>=3  && month<= 5   ) {

            System.out.println("Its Spring");

        } else if (month>=6  && month<= 8 ) {

            System.out.println("It's Summer");


        } else if (month>=9  && month<= 11) {

            System.out.println("It's Fall");


        } else if (month ==12 || month ==1 || month==2) {

            System.out.println("Its Winter");
        }

    }



}
