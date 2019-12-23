package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeros = {"Iron Man", "Capitan America", "Spiderman",
                "Balck Panther", "Hulk", "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America", "Spiderman",
                "Black Widow", "Wanda", "Capitan Marvel",
                "Capitan America"};


        System.out.println("Marvel Heroes : " + Arrays.toString(marvelHeros));

        System.out.println();

       int size = marvelHeros.length;
        System.out.println("Hero Count = " + size);

        System.out.println();

        String itemToSearch = "Spiderman" ;
        int countOfItem = 0;


        for (String each : marvelHeros) {

            if (each== itemToSearch) {

                countOfItem++;

            }


        }

        System.out.println("Count of Search is  " + countOfItem);





    }

}
