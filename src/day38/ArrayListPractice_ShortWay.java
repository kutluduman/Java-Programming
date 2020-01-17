package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {


        /**
         * Create list of 6 double in short way
         * We will just read them and will not add or remove item
         */


        List<Double> prices = Arrays.asList(9.99, 5.55, 3.76, 8.99, 0.99, 65.67);

        System.out.println(prices);

        int count = 0;

        for (double each : prices) {

            if (each > 5) {

                count++;

            }


        }

        System.out.println("count = " + count);

        // I want to add 2 more prices (does not have to be same list)

        ArrayList<Double> newPrices = new ArrayList<>(prices);

        System.out.println("newPrices = " + newPrices);

        newPrices.add(199.99);
        newPrices.remove(0.99); // remove method will remove first occurrence of the value

        System.out.println("newPrices = " + newPrices);

        ArrayList<Double> oneShot = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));

        System.out.println("oneShot before = " + oneShot);

        // Add 100.99 after 9.99

        oneShot.add(1, 100.99);

        // remove item 3

        oneShot.remove(2);

        System.out.println("oneShot after = " + oneShot);


    }

}
