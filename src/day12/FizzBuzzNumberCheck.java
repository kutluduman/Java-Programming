package day12;

import java.util.Scanner;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        /*

        Create a class called FizzBuzzNumberCheck with main method
        Given a number  , create a variable int num
        If this number can be divided by 5 without remainder  lets print  it Fizz number
          For example.  5 , 15 , 25 , 100
         If this number can be divided by 3 without remainder  lets print  it Buzz number
          For example.  3 , 15 , 9 , 27
        If this number can be divided by both 3 and 5  lets print FizzBuzz Number
         For example.   15 , 45 , 30 , 90
        If no match , just say  NOT MY NUMBER !!!!!!!

        // very important: you should go with the most speciic logical order first! so that's why we check
        // the divisible by 3 and 5 specification first

         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Your number is : ");

        int num = scan.nextInt();



        if(num % 5 == 0 && num % 3 == 0){
                System.out.println("FizzBuzz number");


        } else if(num % 5 == 0){
            System.out.println("Buzz number");


        } else if(num % 3 == 0) {
            System.out.println("Fizz number");


        } else {
            System.out.println("not my number");


        }


    }
}





