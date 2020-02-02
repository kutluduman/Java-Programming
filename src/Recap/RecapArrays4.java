package Recap;

import java.util.Arrays;

public class RecapArrays4 {

    public static void main(String[] args) {


        int[] arr = {10, 20, 30};

        char[] charArr = {'k', 'u', 't', 'l', 'u'};

        String[] stringArr = {"Kevin", "Hart"};

        System.out.println(stringArr[0]);

        String surname = stringArr[1];

        System.out.println(surname);


        // initializing the size of array :


        // we see the default values by loop
        int[] myNumbers = new int[5];

        for (int i = 0; i < myNumbers.length; i++) {

            System.out.println(myNumbers[i]);


        }

        myNumbers[0] = 12;

        System.out.println(Arrays.toString(myNumbers));


        // combining two arrays

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};

        int[] array3 = new int[array1.length + array2.length];


        for (int i = 0; i < array1.length; i++) {

            array3[i] = array1[i];


        }

        for (int i = 0; i < array2.length; i++) {

            array3[i + array1.length] = array2[i];

        }


        for (int i = 0; i < array3.length; i++) {

            System.out.print(array3[i] + " ");


        }


    }
}
