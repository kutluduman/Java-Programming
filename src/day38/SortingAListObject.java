package day38;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

import java.util.*;

public class SortingAListObject {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(300, 200, 700, 600, 800));

        System.out.println("nums before sort = " + nums);

        // 2 ways to sort an ArrayList
        // Use Collections utility class(just like Arrays utility class for array objects)
        // Collections is a class coming from Java.util package
        // it has a lot of ready method to work with Collection objects like ArrayList and so on


        Collections.sort(nums);

        System.out.println("nums after sort = " + nums);


        // This version of sort method accept two argument
        // 1st is the list to be sorted
        // 2nd a Comparator object that contain comparing logic
        // good news is there is already a ready method in Java
        // we can get reverse order comparator object by calling
        // Comparator.reverseOrder, just use it
        Collections.sort(nums, Comparator.reverseOrder());

        System.out.println("nums after reverse = " + nums);

        // List itself also has sort method that accept one Comparator object
        // simple way to get Comparator objects are
            // Comparator.naturalOrder()----> low to high
            // Comparator.reverseOrder()----> high to low

        nums.sort(Comparator.naturalOrder());

        System.out.println("nums natural order = " + nums);

        nums.sort(Comparator.reverseOrder());

        System.out.println("nums reverse order = " + nums);




    }
}
