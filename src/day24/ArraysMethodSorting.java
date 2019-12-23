package day24;

import java.util.Arrays;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);

        System.out.println();

        System.out.println(Arrays.toString(scores));

        System.out.println();

        System.out.println("New First item value : " + scores[0]);

        System.out.println();

        char[] nameChar = {'G', 'A', 'D', 'Z', 'C','A'};

        System.out.println(Arrays.toString(nameChar));

        System.out.println();

        Arrays.sort(nameChar);

        System.out.println(Arrays.toString(nameChar));

        System.out.println("---------- boolean sorting -----SORT METHOD DOES NOT WORK FOR BOOLEAN ARRAY-------");

        boolean[] fiveSwitchOnOffs = {true, false, false, true, true};

        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));

        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY !!

        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order


    }
}
