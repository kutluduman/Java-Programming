package day06;

import java.util.Scanner;


public class SaleCalculator {

    public static void main(String[] args) {

        // WAKE UP TASK :
        //
        //Create a program to calculate the final discounted price of an Item
        //
        //Create 3 double variables  called  regularPrice , salePrice and discount
        //
        //Ask user question using scanner for regularPrice and discountPercentage
        //And save the result into the variable
        //
        //Calculate sale price using above information
        //For example :  80 regular price , 0.2 for discount  , salePrice —>> 64
        //
        //Print out  : regular price is 80$ , discount is 0.2  and your got deal for 64 $



        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is the regular price of this item?");

        double regularPrice = scan.nextDouble();

        System.out.println("What is the percentage discount on this item?");

        double discount = scan.nextDouble();

        double salePrice = regularPrice - regularPrice * discount ;

        System.out.println("The price after the discount for the item is "
        + salePrice);

        // Teacher's soulution

        /*

        Scanner scan = new Scanner(System.in) ;

        double regularPrice;
        double salesPrice;
        double discount;

        if you have same kind of variables you can save line by:

        double regularPrice, salesPrice, discount ;

              System.out.println("What is the regular price?");
              regularPrice = scan.nextDouble();

            System.out.println("What is the discount?");
            discount = scan.nextDouble();

            salePrice = regularPrice - regularPrice * discount ;

            System.out.println(" Regular price is " + regular price + " and the discount
            is " + discount + " so the final sale price is " + salesPrice);


         */



    }

}
