package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingItems {

    public static void main(String[] args) {

        // Creating HashMap objects

        Map<String, Integer> nameAgePair = new HashMap<>();

        // adding elements : put

        nameAgePair.put("Zehra", 14);
        nameAgePair.put("Muhammed",27);
        nameAgePair.put("Maia", 21);
        nameAgePair.put("Kamran", 27);

        System.out.println("nameAgePair = " + nameAgePair);

        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));

        System.out.println("nameAgePair.containsKey(\"Zehra\") = " + nameAgePair.containsKey("Zehra"));

       nameAgePair.putIfAbsent("Zehra",10);

       nameAgePair.replace("Maia",17);
        System.out.println("nameAgePair.get(\"Maia\") = " + nameAgePair.get("Maia"));

        nameAgePair.replace("Zehra",14,9);

        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));
        
        nameAgePair.remove("Kamran");

        System.out.println("nameAgePair = " + nameAgePair);
        
        
        


    }
}
