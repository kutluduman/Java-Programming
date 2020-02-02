package Recap;

public class RecapArrays {

    public static void main(String[] args) {

        // write a program that can return the maximum value from an int array

        int[] arr = {20, 200, 30, 40, 50, 500};

        int maximum = 0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] > maximum) {

                maximum = arr[i];


            }

        }

        System.out.println("Maximum number is " + maximum);


        // find the second max :

        int secondMax = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > secondMax && arr[j] != maximum) {

                secondMax = arr[j];

            }

        }

        System.out.println("secondMax = " + secondMax);


    }
}
