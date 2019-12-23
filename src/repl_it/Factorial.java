package repl_it;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long factorial = 1;

        for (long x = n ; x>0 ; --x ) {

            factorial*=x;      // ****** why do we put factorial as 1




        }

        System.out.print(factorial);




    }


}
