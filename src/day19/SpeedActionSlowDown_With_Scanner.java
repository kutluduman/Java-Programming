package day19;

import java.util.Scanner;

public class SpeedActionSlowDown_With_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting and ending speed : ");

        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start<end) { // i will increase the speed until i reach the end speed


        for (int i = start ; i <= end ; i++) {


            System.out.print(i + " ");

        }


        } else if (start>end) { // i will decrease the speed until i reach the end speed

        for (int x = start ; x >= end ; --x) {

            System.out.print(x + " ");


        }


        } else  {

            System.out.println("No action needed, speed is same");



        }









    }

}
