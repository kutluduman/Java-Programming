package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListParameter {

    public static void main(String[] args) {

        /**
         * Create a method that accepts a List of String as argument
         * same thing as a method that has list of String parameter
         * and print out each and every item in the list vertically
         */

        ArrayList<String> name = new ArrayList<>();

        name.add("Qalbinur");
        name.add("Ruzi");
        name.add("Sabahiddin");
        name.add("Guzelnurin");

        printAList(name);

        String resultLongest = getLongestElement(name);

        System.out.println("result longest = " + resultLongest);


    }


    public static void printAList(ArrayList<String> list) {

        for (String each : list) {

            System.out.println("each = " + each);

        }


    }

    public static String getLongestElement(List<String> nameLst) {

        String longestName = ""; //nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {
            String currentName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        return longestName;
    }


}
