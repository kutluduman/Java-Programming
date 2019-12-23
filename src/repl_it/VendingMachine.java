package repl_it;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {


        int itemPrice, quarters, dimes, nickels ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter price in cents:");

        itemPrice = scan.nextInt();

        quarters = itemPrice/25;
        int remainingAfterQuarters = itemPrice%25;

        dimes = remainingAfterQuarters /10 ;

        int remainingAfterDimes = remainingAfterQuarters %10;

       nickels = remainingAfterDimes/5  ;

       int penny = remainingAfterDimes%5 ;

       if (itemPrice>=25 && itemPrice<=100) {

           System.out.println("Your change is " +quarters+ " quarters, " +dimes+ " dimes, and " + nickels + " nickels" + penny+ "pennies.");
       } else if (itemPrice%5 != 0) {

           System.out.println("Invalid Item");
       } else if (itemPrice < 25) {

           System.out.println("Invalid item");

       } else if (itemPrice >100) {


            System.out.println("Invalid item");
        }

    }
}
