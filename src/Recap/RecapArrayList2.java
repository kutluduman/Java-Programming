package Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapArrayList2 {

    public static void main(String[] args) {

        /**
         * Write a return method that can remove the duplicated objects from a String ArrayList
         */

        String[] names = {"Denis", "Alp", "Kevin", "Kevin", "Kevin"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println("list = " + list);

        list = removeDup(list);
        System.out.println("list = " + list);


    }

    public static ArrayList<String> removeDup(ArrayList<String> list) { // method overloading, same name for method,
        // but returns different String ArrayList
        ArrayList<String> result = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            if (!result.contains(list.get(i))) {

                result.add(list.get(i));


            }


        }

        return result;

    }
}
