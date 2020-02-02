package Recap;

public class RecapArrays2 {

    public static void main(String[] args) {

        // write a program that return the minimum value from an int array


        int[] arr = {100, 2, 2, 3, 4, 5, 6};

        int min = 99999999; // give large min number

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < min) {

                min = arr[i];

            }

        }

        System.out.println("min = " + min);

        // find the second minimum


        int secondMin = 999999;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < secondMin && arr[j] != min) {

                secondMin = arr[j];


            }

        }

        System.out.println("secondMin = " + secondMin);

    }
}
