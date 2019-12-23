package repl_it;

import java.util.Scanner;

public class PostiveOrNegative {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

    if (num >= 1) {

        System.out.println("positive");

    }

    if ( num < 0) {

        System.out.println("negative");
    }


    if (num == 0) {

        System.out.println("zero");
    }



    }


}
