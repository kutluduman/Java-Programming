package day64;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSet {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);


        System.out.println("groceryPriceMap = " + groceryPriceMap);





    }
}
