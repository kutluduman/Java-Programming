package day10;

import java.util.Scanner;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to McDonald , what can I get for you");

      /*
      1 burger
      2 french fries
      3 nuggets
      4 ice cream
      5 coke
       */

        String order = "";
        int itemNumber = scan.nextInt();

        if (itemNumber == 1) {
            System.out.println("You selected order " + itemNumber);
            order = "Burger";

        } else if (itemNumber == 2) {
            System.out.println("You selected order " + itemNumber);
            order = "French Fries";

        } else if (itemNumber == 3) {
            System.out.println("You selected order " + itemNumber);

            order = "Nuggets";

        } else if (itemNumber == 4) {
            System.out.println("You selected order " + itemNumber);
            order = "Ice Cream";

        } else if (itemNumber == 5) {
            System.out.println("You selected order " + itemNumber);
            order = "Coke";
        } else {
            order = "Wrong, Try again";
    }

        System.out.println("Your order is " + order);

    }
}