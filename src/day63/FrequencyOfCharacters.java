package day63;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBBBBBACCRDDD";

        // Get the frequency and store into map <Character, Integer>

        Map<Character, Integer> charFrequency = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {

            if (!charFrequency.containsKey(str.charAt(i))) {

                charFrequency.put(str.charAt(i), 1);

            } else {

                charFrequency.replace(str.charAt(i),charFrequency.get(str.charAt(i)) + 1);

            }


        }

        System.out.println("charFrequency = " + charFrequency);

    }
}
