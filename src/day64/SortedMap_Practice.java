package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {

    public static void main(String[] args) {


        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();
        
        
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);

        System.out.println("groceryPriceMap = " + groceryPriceMap);


        



    }
}
