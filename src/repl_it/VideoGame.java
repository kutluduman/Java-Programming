package repl_it;

import java.util.Scanner;

public class VideoGame {

    public static void main(String[] args) {

        /*
            Example1:

            Display prompt: "Enter number of coupons:"
            13
            Display prompt: "Number of Candies: 1"
            Display prompt: "Number of Gumballs: 1"

            Display prompt: "Enter number of coupons:"
            2
            Display prompt: "Not enough coupons"
         */

        int coupons = 0;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        coupons = scan.nextInt();

        if (coupons<3) {

            System.out.println("Not enough coupons");
        }else {

            int noOfCandies = coupons/10 ;
            int remainder = coupons - noOfCandies*10;
            int noOfGumballs = remainder/3 ;

            System.out.println("Number of Candies: " + noOfCandies);
            System.out.println("Number of Gumballs: " + noOfGumballs);


        }








    }
}
