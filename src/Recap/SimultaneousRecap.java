package Recap;

import java.util.Arrays;

public class SimultaneousRecap {

    public static void main(String[] args) {

        kmToMiles(100);
        glToLtr(10);
        descending(new int[]{10,8,99,0,-1});


    }


    // Write a method that can convert km to miles

    public static void kmToMiles(double km) {

        double miles = km * 0.612;
        System.out.println("km to miles is = " + miles);


    }


    // Write a method that can convert gallons to litters

    public static void glToLtr(double gallons) {

        double litters = gallons * 3.75;
        System.out.println("gallons to litters is " + litters);

    }

    // Write a method that can print out the array in descending order

    public static void descending(int[] arr) {

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i]+" ");

        }


    }


}
