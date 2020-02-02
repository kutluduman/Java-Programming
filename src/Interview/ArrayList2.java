package Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

    public static void main(String[] args) {

        // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> list = new ArrayList<>();


        for (int each : nums) {

            if (each < 100) {

                list.add(each);

            }


        }

        nums = list;

        System.out.println(nums);


    }
}

