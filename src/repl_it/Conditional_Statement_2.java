package repl_it;

import java.util.Scanner;

public class Conditional_Statement_2 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();

        if (num%2 == 0) {

            System.out.println(num + " is even");



        } else {

            System.out.println(num + " is odd");


        }





    }


}
