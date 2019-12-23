package day22;

import java.util.Scanner;

public class ScannerLoopArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int[] numbers = new int[10];

        for (int x = 0; x <= numbers.length-1 ; x++) {

            System.out.println("Enter your number " + (x+1));       // here we the user gives the numbers but its not
                                                                    // printed as whole numbers
            numbers[x]=scan.nextInt();

            System.out.println(numbers[x]);


        }


        for (int x = 0; x <= numbers.length-1 ; x++) {          // by adding one more loop, the whole numbers are
                                                                // printed.
            System.out.print(numbers[x] + " ");


        }





    }

}
