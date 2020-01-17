package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        /**
         * Create a Array List object of long and assign it to a variable
         * add item, insert an item, read item , update the item, remove the item, check the location
         * Create , Read , Update, Delete
         * 12L is automatically converted to new Long(12L) because ArrayList only store object. purpose of boxing
         * ArrayList order of index is sorted by the way you write the code. Depends to you
         * No size
         * Getting items inside ArrayList object  ----> list.get(index number)
         */


        ArrayList<Long> list = new ArrayList<>();

        list.add(12L);
        list.add(100L);
        list.add(150L);
        list.add(200L);

        System.out.println(list);


        System.out.println("list size = " + list.size());


        System.out.println("First item is " + list.get(0));

        /**
         * Task 01 : Get the sum of Above ArrayList items
         */

        long sum = 0;

        for (int i = 0; i < list.size(); i++) {

            System.out.println(" item " + list.get(i));

            sum += list.get(i);

        }

        System.out.println("sum = " + sum);


        long max = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i)) {

                max = list.get(i);

            }

        }

        System.out.println("max = " + max);

    }
}
