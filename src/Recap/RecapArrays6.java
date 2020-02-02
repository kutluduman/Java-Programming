package Recap;

import java.util.Arrays;

public class RecapArrays6 {

    public static void main(String[] args) {

        // 1 --->  print the unique in the list

        int[] arr = {1, 1, 2, 2, 3, 4, 4};


        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    count++;
                }


            }

            if (count == 1) {
                System.out.println(arr[i]);

            }

        }

    }

}
