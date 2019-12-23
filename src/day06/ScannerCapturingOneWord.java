package day06;

import java.util.Scanner;


public class ScannerCapturingOneWord {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("What is your name?");

        String name = scan.next(); // it will only capture first word(seperate by space)

        String anotherWord = scan.next();


        System.out.println("You have entered " + name);
        System.out.println("Another word is " + anotherWord);




    }


}
