package day63;

import java.util.HashMap;
import java.util.Map;

public class MapGroceryItems {

    public static void main(String[] args) {


        Map<String, Double> groceryItemsPair = new HashMap<>();

        groceryItemsPair.put("Tomato", 1.99);
        groceryItemsPair.put("Potato", 1.99);
        groceryItemsPair.put("Tomato", 3.00);
        groceryItemsPair.put("Grape", 3.99);
        groceryItemsPair.put("Banana", 0.69);
        groceryItemsPair.put("Apple", 1.89);
        groceryItemsPair.putIfAbsent("Fish", 12.99);
        groceryItemsPair.putIfAbsent("Apple", 100.0);

        System.out.println("groceryItemsPair.size() = " + groceryItemsPair.size());
        System.out.println("groceryItemsPair = " + groceryItemsPair);

        System.out.println("groceryItemsPair.get(\"Tomato\") = " + groceryItemsPair.get("Tomato"));

        //     groceryItemsPair.replace("Apple",1.89*2);

        groceryItemsPair.replace("Apple", groceryItemsPair.get("Apple") * 2);

        System.out.println("groceryItemsPair.get(\"Apple\") = " + groceryItemsPair.get("Apple"));


    }
}
