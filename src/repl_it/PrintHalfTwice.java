package repl_it;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstHalf = word.substring(0,word.length()/2);

        System.out.println(firstHalf+""+firstHalf);



    }
}
