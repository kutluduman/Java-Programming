package Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapArrayList5 {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Rob", "Bran", "Rick", "Bran"));

        System.out.println("names = " + names);


        if (names.remove("Bran")) { // true boolean expression, that's why removes Bran from the list

            names.remove("John"); // this is false expression, because we do not have John in the list


        }

        System.out.println("names = " + names);


    }
}
