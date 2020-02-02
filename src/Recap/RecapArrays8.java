package Recap;

import java.util.Arrays;

public class RecapArrays8 {

    public static void main(String[] args) {

        // write a program that will print the arrays in descending order

        int[] arr = {99, 10, 200, 3000, 40, 50, 5000};
        String result = "[";

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {

            result += arr[i] + ", ";

        }

       result= result.trim().substring(0,result.length()-2);
        System.out.println(result+"]");

    }

}
