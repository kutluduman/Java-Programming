package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

//         Arrays Class is a class coming from java.util package
//         it has a a lot of pre-built method to work with array object


//          for printing the content of the array
//          toString ---> Arrays.toString(yourArrayHere)

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Flash"};

        System.out.println(Arrays.toString(superHeroes)); // to print out

       String superHeroesAsString = Arrays.toString(superHeroes);

        System.out.println();

        System.out.println(superHeroesAsString.charAt(1));

        System.out.println();

        int[] numbers = {10,44,55,3,78};

        System.out.println(Arrays.toString(numbers));


//          for sorting an array in ascending order
//          sort ----> Arrays.sort(yourArrayHere)


//          for checking for equality of 2 array object content
//          equals ----> Arrays.equals(fistArray,secondArray)



    }



}
