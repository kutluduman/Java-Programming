package repl_it;

import java.util.Scanner;

public class Ternary_Operator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        System.out.println((x>=5)?(x):(-x));




    }
}
