package day16;

import java.util.Scanner;

public class Give_Me_5_v2 {

    public static void main(String[] args) {


        // I want to ask user to enter a number
        // I will keep asking until the user actually enter number 5

        Scanner scan = new Scanner(System.in);

        int userNum = 0 ;


        while (userNum != 5 ) {

            System.out.println("Give me 5");
            userNum = scan.nextInt();


        }

        System.out.println("END OF THE PROGRAM");









    }

}
