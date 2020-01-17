package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {

    public static void main(String[] args) {


        List<String> superHeroes = new ArrayList<>();

        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder woman");
        superHeroes.add("Cyborg");
        superHeroes.add("Aquaman");
        superHeroes.add("Flash");

        System.out.println("superHeroes = " + superHeroes);

        // do we have superman in the list

        System.out.println(superHeroes.contains("Does the array contain superman"
                + superHeroes.contains("Superman")));


        // remove the heroes that does not have man in the name

        for (int x = 0; x < superHeroes.size(); x++) {

            if (!superHeroes.get(x).contains("man")) {

                superHeroes.remove(superHeroes.get(x));

                // once hero is removed, this index will be filled by next item
                // so we need to decrease the index by 1 so stay at same index

                --x; // once item is removed , it will decrease the index to stay at same index in next iteration


            }


        }

        System.out.println("superHeroes = " + superHeroes);

        // take away from here :
        //  removing item during the for loop
        //  when you remove 1 item , you will have one less item in the list
        //  everything after the removed item will move to one index to the left
        //  so in order not to miss the item right after the removed item
        //  we need to decrease the index by one to stay at same index after removing


        List<String> superHeroCopy = new ArrayList<>(superHeroes); // copying your list to another ArrayList

        System.out.println(superHeroCopy);


        // Unmodifiable
        List<String> topics = Arrays.asList("Java", "Selenium", "API");
        System.out.println("topics = " + topics);

        // but we can copy so that we can modify it

        List<String> topicsCopy = new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);


    }


}
