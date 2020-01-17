package day37;

import java.util.ArrayList;

import java.util.List;

public class PriceListPractice {

    public static void main(String[] args) {


        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);


        System.out.println("Price list : " + priceList);

        /**
         * change the third price to 10$
         * Add 4 dollar to first price
         * change last price to sum of first and second price
         *  give 40% off to second price
         *  Double the value of each and every price in the list
         *  Cut the price into half if the price is more than 20$
         *  swap the first value with the last value
         */


        // change the third price to 10$ :
        System.out.println();

        priceList.set(2, 10.0);

        System.out.println(priceList.get(2));

        // Add 4 dollar to first price :

        System.out.println();

        priceList.set(0, priceList.get(0) + 4);

        System.out.println(priceList.get(0));

        // change last price to sum of first and second price :

        System.out.println();

        double sumOfFirstTwoItem = priceList.get(0) + priceList.get(1);

        priceList.set(priceList.size() - 1, sumOfFirstTwoItem);

        System.out.println(priceList.get(priceList.size() - 1));

        System.out.println(priceList);

        // give 40% off to second price
        System.out.println();

        priceList.set(1, priceList.get(1) * 0.6);

        System.out.println(priceList.get(1));

        // Double the value of each and every price in the list

        for (int x = 0; x < priceList.size(); x++) {

            priceList.set(x, priceList.get(x) * 2);

        }

        System.out.println(priceList);

        // Cut the price into half if the price is more than 20$
        System.out.println();

        for (int x = 0; x < priceList.size(); x++) {

            if (priceList.get(x) > 20) {

                priceList.set(x, priceList.get(x) / 2);

            }


        }

        System.out.println(priceList);

        // swap the first value with the last value :

        System.out.println();

        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size() - 1));
        priceList.set(priceList.size() - 1, temp);

        System.out.println(priceList);


    }
}
