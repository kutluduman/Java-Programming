package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {

    public static void main(String[] args) {

        String str1 = "Java is fun fun fun and Selenium will be fun too";

        getFrequencyMap(str1);

        System.out.println("str1 = " + str1);


    }

    // Why this is Static? So I can call it directly in Main to test
    // Can I not make it static? Yes you can, then you will have to create object then call it
    // Can it be void? Yes you can use void if that's what you want
    // but here Requirement is getFrequencyMap and returns it to the caller
    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> frequency = new HashMap<>();

        String[] split = str.split(str);

        for (String eachWord : split) {

            if (!frequency.containsKey(eachWord)) {

                frequency.put(eachWord, 1);

            } else {

                frequency.replace(eachWord, frequency.get(eachWord) + 1);


            }


        }

        return frequency;

    }

}

