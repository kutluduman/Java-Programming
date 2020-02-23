package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {


        String str = "Finding Words Frequency Sounds Fun, Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " + " Do it and find out Words Words";

        System.out.println("str = " + str);

        String[] allWords = str.split(" ");
        System.out.println("allWords.length = " + allWords.length);

        // we want to solve this using the map
        // because Map only can have unique key, so we can use it for unique words
        // first create Map object HashMap implementation

        // Loop through the word array
        // Check if we already have the word in the key or not
        // If we do not have the key, it means we are entering for the first time
        // so the count will be 1 , add using put method
        // else it means we already have it in the key
        // so we get existing count using that key
        // and replace the old count value with new count value by incrementing by 1


        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String eachWord : allWords) {

            if (!wordFrequency.containsKey(eachWord)) {

                wordFrequency.put(eachWord, 1);

            } else {

                wordFrequency.replace(eachWord, wordFrequency.get(eachWord) + 1);
                
            }


        }

        System.out.println("wordFrequency = " + wordFrequency);

    }
}
