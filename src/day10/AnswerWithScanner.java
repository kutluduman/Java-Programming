package day10;

import java.util.Scanner;

public class AnswerWithScanner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String myAnswer = "" ;

        System.out.println("Chose a Number : ");
        int myNumber = scan.nextInt();


        if (myNumber % 5 == 0) {

            myAnswer = "Fizz Number";


        } else {

            myAnswer = "Not a Fizz Number";
        }

        System.out.println("My number is " + myNumber + " and it is a " +myAnswer);



    }

}
