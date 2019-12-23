package day05;

import java.util.Scanner;

public class GroceryShopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is the price for potatoe");


        float potatoePrice = scan.nextFloat();

        System.out.println("How many do you want to buy?");

        int potatoeCount = scan.nextInt();

        System.out.println("Your total cost of potatoe is " +
                (potatoePrice * potatoeCount ));


        Scanner input = new Scanner(System.in);

        System.out.println("What is the price of banana?");

        float priceOfBanana = input.nextFloat();

        System.out.println("How many do you want to buy?");

        int bananaCount = input.nextInt();

        System.out.println("The total cost of banana is " +
                ( bananaCount * priceOfBanana));


        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the price of tomatoe?");

        float priceOfTomatoe = userInput.nextFloat();

        System.out.println("How many tomatoe do you want to buy?");

        int countTomatoe = userInput.nextInt();

        System.out.println("Total price of tomatoe is " +
                ( countTomatoe * priceOfTomatoe ));

    }
}



// ask user whats the price of tomato and store it
// ask user how many tomato you want to buy and store it
// ask user whats the price of potato and store it
//ask user how many potato you want to buy and store it
//ask user whats the price of banana and store it
//ask user how many banana you want to buy and store it