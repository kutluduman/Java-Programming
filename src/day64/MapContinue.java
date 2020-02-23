package day64;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 1.99);
        groceryPriceMap.put("Tomato", 3.00);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        groceryPriceMap.putIfAbsent("Fish", 12.99);
        groceryPriceMap.putIfAbsent("Apple", 100.0);

        // Storing Map into collection Set
        Set<String> allNames = groceryPriceMap.keySet();
        System.out.println("allNames = " + allNames);
        
//        allNames.remove("Tomato");
//        System.out.println("allNames = " + allNames);
//        System.out.println("groceryPriceMap after= " + groceryPriceMap);

        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);



    }
}
