package Recap;

import java.util.ArrayList;
import java.util.List;

public class RecapArrayList10 {

    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg"); // when we remove Cyborg , Flash become the item at index 2
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");


        for (int i = 0; i < superHeros.size(); i++) {

            if (!superHeros.get(i).contains("man")) {

                superHeros.remove(superHeros.get(i));

                --i; // once item is removed , it will decrease the index to stay at same index in next iteration


            }


        }


    }
}
