package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices = {99.23, 11.99,100.23,99.99, 56.34} ;

        // for each loop syntax

        for (int x = 0; x <= prices.length-1 ; x++) {

            double eachPrice = prices[x];
            System.out.println("eachPrice = " + eachPrice);

        }

        System.out.println("");

        // second way to make your life easy:

        // there is no infinite loop
        // for each loop can only be used for array

        for (double eachPrice : prices) {

            System.out.println("eachPrice = " + eachPrice);
            
            
        }






    }

}
