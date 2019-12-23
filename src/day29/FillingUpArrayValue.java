package day29;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

      // create an array with size 100 and fill it up as below
        // fill up this array from 1 to 100


      int[] numbers = new int[100];

//        System.out.println(Arrays.toString(numbers)); // default answer 0

//        numbers[0]=1;
//        numbers[1]=2;
//        numbers[3]=3;


        for (int x = 0; x <numbers.length ; x++) {

            numbers[x]=x+1;


        }

        System.out.println(Arrays.toString(numbers));












    }
}
