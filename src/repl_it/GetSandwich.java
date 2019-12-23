package repl_it;

import java.util.Scanner;

public class GetSandwich {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first!=last) {

            System.out.println(str.substring(first+5,last));


        } else {

            System.out.println("Nothing");


        }






    }
}
