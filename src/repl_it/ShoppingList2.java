package repl_it;

import java.util.Scanner;

public class ShoppingList2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        double item1price = count1 * price1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        double item2price = count2 * price2;


        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        double item3price = count3 * price3;

        double totalPrice;
        String report;

        if (count1 == 0) {

            totalPrice = item2price + item3price;
            report = "Item2: " + item2 + " Price: " + item2price + ", " + "Item3: " + item3 + " Price: " + item3price;

        } else if (count2 == 0) {

            totalPrice = item1price + item3price;
            report = "Item1: " + item1 + " Price: " + item1price + ", " + "Item3: " + item3 + " Price: " + item3price;

        } else if (count3 == 0) {

            totalPrice = item1price + item2price;
            report = "Item1: " + item1 + " Price: " + item1price + ", " + "Item2: " + item2 + " Price: " + item2price;

        } else {

            totalPrice = (item1price + item2price + item3price);
            report = ("Item1: " + item1 + " Price: " + item1price + ", " + "Item2: " + item2 + " Price: " + item2price + ", " + "Item3: " + item3 + " Price: " + item3price);

        }

        System.out.println(report + "\nTotal price: " + totalPrice );



    }
}