package repl_it;

import java.util.Scanner;

public class ShoppingList3 {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String input = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        //code starts here

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            scan.nextLine();

            totalPrice += price;

            shoppingListReport += "Item" + count + ": "+item + " Price: "+price+", ";
            count++;

            System.out.println("Add one more item?");
            input = scan.nextLine();

        }
        while (input.equalsIgnoreCase("yes") && count<=10);

        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);

    }
}