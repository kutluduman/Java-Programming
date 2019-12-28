package day33;

import java.util.Scanner;

public class ReturnWillTerminateMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number more than 10 ");

        int num = scan.nextInt();
        if (num < 10) {
            // you can use return keyword to get out of the method
            // in void methods, as long as you don't actually return a value
            // below line is only thing you can do !!!
            return;

        }

        System.out.println("Happy holidays");
        System.out.println("2 Days off! Yay");

    }
}
