package repl_it;

import java.util.Arrays;

public class ArraysCopyCertainValues {

    public static void main(String[] args) {


        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two","three","four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        String wordsWithE = "";
        for (String each : arr)

            if (each.contains("e")) {

                wordsWithE+= each + " ";


            }

        String[] fewValues=wordsWithE.split(" ");

        System.out.println(Arrays.toString(fewValues));








        //YOUR CODE ENDS HERE -----------------------

        return fewValues;







    }
}
