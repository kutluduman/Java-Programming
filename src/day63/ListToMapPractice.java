package day63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Abraham");
        names.add("Zeliha");
        names.add("OnurAlp");
        names.add("Tuba");
        names.add("Seda");
        names.add("Birnigar");
        names.add("Nuran");
        names.add("Murat");
        names.add("Hakan");

        Map<String, Integer> nameCharCountPair = new HashMap<>();
        
        for (String eachMember : names){
            
            nameCharCountPair.put(eachMember, eachMember.length());
            
        }

        System.out.println("nameCharCountPair = " + nameCharCountPair);
    
    }
}
