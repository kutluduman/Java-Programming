package repl_it;

import java.util.Scanner;

public class PrintFirstAndLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();




        String first = word.substring(0,1);
        String last = word.substring(word.length()-1);

        System.out.println(first + ""+last);













    }
}
