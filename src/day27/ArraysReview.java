package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

    public static void main(String[] args) {

        int num = 10 ;
        int[] arr = {10,20, 30, 40, 50, 60} ;


        for (int x = 0 ; x<arr.length ; x++) {


            System.out.print(arr[x]+ " ");


        }

        System.out.println("\n==========================================");

        System.out.println(Arrays.toString(arr));


        System.out.println("\n==========================================");


        // Task01 ; Write a program that asks user to enter a number 5 times
        // and store those numbers into array

       int[] numbers = new int[5];

        System.out.println(Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in);

        System.out.println("\n==========================================");


        for (int i = 0; i <numbers.length ; i++) {

            System.out.println("Enter an int number : ");

   //         int input =  scan.nextInt(); // returns int data type

             numbers[i]=scan.nextInt();

        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("\n==========================================");


        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("\n==========================================");


        int largestNumber = numbers[numbers.length-1] ;

        System.out.println("Largest number is : " + largestNumber);

        System.out.println("\n==========================================");

        int minimumNo = numbers[0];

        System.out.println("Minimum number is : " +minimumNo);


        System.out.println("\n==========================================");




    }
}
