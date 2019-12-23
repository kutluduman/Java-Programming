package day16;

import java.util.Scanner;

public class Give_Me_5 {

    public static void main(String[] args) {


        // I want to ask user to enter a number
        // I will keep asking until the user actually enter number 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me Five !!!");


        int userNum = scan.nextInt();


        if (userNum != 5) {

            System.out.println("Hey you did not enter 5 ");


        }


        System.out.println("End of the Program");




    }

}
