package day64;

import java.util.*;

public class Map_valuesView {

    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);



        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices);
        allPrices.remove(1.99);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        List<Double> pricesCopy = new ArrayList<>(allPrices);
 //       List<Double> pricesCopy1 = new ArrayList<>(groceryPriceMap.values());




    }
}
