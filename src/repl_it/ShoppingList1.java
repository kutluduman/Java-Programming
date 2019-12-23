package repl_it;

import java.util.Scanner;

public class ShoppingList1 {

    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        String tomatoes = scan.next();
        double priceTomatoes = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String cheese = scan.next();
        double priceCheese = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String apples = scan.next();
        double priceApples = scan.nextDouble();
        double totalPrice = priceTomatoes +priceCheese +priceApples ;

        System.out.println("Item1: " + tomatoes +
                " Price: " + priceTomatoes + ", Item2: " + cheese +
                " Price: " + priceCheese + ", Item3: " + apples +
                " Price: " + priceApples + " Total price: " + totalPrice );




    }
}
