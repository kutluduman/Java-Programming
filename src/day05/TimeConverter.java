package day05;

import java.util.Scanner;


public class TimeConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many Days do you want to convert to minute?");


        int days = scan.nextInt();

        int minute = days*1440;

        System.out.println( + days + " days has " + minute + " minutes");




    }


}
