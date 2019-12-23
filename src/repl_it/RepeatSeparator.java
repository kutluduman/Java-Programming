package repl_it;

import java.util.Scanner;

public class RepeatSeparator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();// scan.nextLine();
        int count = scan.nextInt();

        String result = "";

        String output = word;

        for ( int i = 1 ; i <= count-1 ; i++) {



            output += separator + word;




        }

        System.out.println(output);



    }

}


