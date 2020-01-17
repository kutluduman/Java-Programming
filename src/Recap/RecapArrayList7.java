package Recap;

import java.util.ArrayList;
import java.util.List;

public class RecapArrayList7 {

    public static void main(String[] args) {


        List<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");

        System.out.println(getLongestName(nameLst));


    }

    public static String getLongestName(List<String> nameList) {

        String longestName = "";


        for (int i = 0; i < nameList.size(); i++) {

            String currentName = nameList.get(i);

            if (currentName.length() >= longestName.length()) {

                longestName = currentName;


            }


        }

        return longestName;


    }

}
