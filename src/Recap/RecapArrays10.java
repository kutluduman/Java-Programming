package Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecapArrays10 {

    public static void main(String[] args) {

        String[] arr = {"A", "B"};

        String[][] arr2D = {{"A", "B"}, {"C", "D"}};


        // Print A;

        System.out.println(arr2D[0][0]);

        // Print D ;

        System.out.println(arr2D[1][1]);

        // Print A and B ;

        System.out.println(Arrays.toString(arr2D[0]));

        // C and D

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(Arrays.deepToString(arr2D));

    }

}
