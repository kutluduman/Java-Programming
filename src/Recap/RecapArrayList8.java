package Recap;

import java.util.ArrayList;
import java.util.List;

public class RecapArrayList8 {

    public static void main(String[] args) {

        // double every price

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


        for (int i = 0; i < priceList.size(); i++) {


            priceList.set(i, priceList.get(i) * 2);

        }


        System.out.println(priceList);


    }


}
