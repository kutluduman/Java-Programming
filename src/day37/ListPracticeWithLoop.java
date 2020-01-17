package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {


        /**
         * Create an ArrayList of Integer and fill it up with 1-100
         * change all the odd number value to 0
         * Insert 100 to first Index
         * how to find index of 20
         */


        List<Integer> nums = new ArrayList<>();

        for (int x = 1; x <= 100; x++) {


            nums.add(x);


        }

        System.out.println("nums = " + nums);

        System.out.println();

        // change all the odd number value to 0 ;
        System.out.println();

//        for (int x = 0; x < nums.size(); x++) {
//
//            if (nums.get(x) % 2 == 1) {
//
//                nums.set(x, 0);
//
//            }
//
//
//        }


        // change all the odd number value to 0 ;
        // from what we observed , all the odd numbers are at even index : 0 , 2 ,4 , 6.......
        // so we can just work with those even index and set the value to 0 at those location

        for (int i = 0; i < nums.size(); i += 2) {

            nums.set(i, 0);

        }

        System.out.println(nums);


        // Insert 100 to first Index
        System.out.println();

        nums.add(0, 100);

        System.out.println(nums);

        // how to find index of 20 :

        System.out.println();

        nums.indexOf(20);
        System.out.println("nums index of 20 = " + nums.indexOf(20));


        System.out.println();


    }
}
