package day63;

import java.util.HashMap;
import java.util.*;

public class MapIntro {

    public static void main(String[] args) {

        // Compared to List, Set which store single element per item
        // Map store key-value pair per item
        // That's why we need to data type inside <>
        // one for the key one for the value

        Map<String, String> nameAndStatePair = new HashMap<>();

        Map<Integer, String> groupNumLeaderNamePair = new HashMap<>();

        Map<String, Double> groceryNameAndPricePair = new HashMap<>();

        Map<String, Boolean> voterAndEligibilityPair = new HashMap<>();

        Map<String, Integer> scoreMap = new HashMap<>();

        Map<String, Integer> gameNameAndScoreMapPair = new HashMap<>();

        Map<Byte, Character> qNumAndCorrectAnswerPair = new HashMap<>();


    }
}
