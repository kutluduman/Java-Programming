package Recap;

public class RecapArrays7 {

    public static void main(String[] args) {

        // write a program to print unique from String array


        String[] arr = {"A", "A", "B", "C", "C"};


        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals( arr[j]) ){

                    count++;

                }

            }

            if (count == 1) {

                System.out.println(arr[i]);

            }

        }


    }

}
