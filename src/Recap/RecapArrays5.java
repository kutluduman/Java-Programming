package Recap;

import java.util.Arrays;
import java.util.Scanner;

public class RecapArrays5 {

    public static void main(String[] args) {

        // ask user to enter five numbers, then find the sum of those five numbers
        // you must use array

//
//        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = scan.nextInt();
//
//        }
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            sum += arr[i];
//
//        }
//        System.out.println("sum = " + sum);


        // ask user to enter 5 names and return the longest name

        String[] names = new String[5];
        int max = 0;
        String longestName = "";

        for (int i = 0; i < names.length; i++) {
            names[i] = scan.next();


            if (names[i].length() > max) {

                max = names[i].length();
                longestName = names[i];
            }


        }

        System.out.println("max = " + max);
        System.out.println("longestName = " + longestName);

    }
}
