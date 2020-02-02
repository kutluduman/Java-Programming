package Recap;

import java.util.ArrayList;

public class RecapArrayList11 {

    /**
     * Create a method that:
     *
     * is called twoTimes
     * returns a new ArrayList of Integers
     * takes in a single parameter - an ArrayList of Integers
     *
     * This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
     *
     * For example, if the parameter is
     * (1,5,3,7)
     * The method should return a new ArrayList of Integers with
     * (1,1,5,5,3,3,7,7)
     *
     */

    public static void main(String[] args) {


    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {

            newList.add(i, list.get(i));


        }

        return newList;

    }


}
