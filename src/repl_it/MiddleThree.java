package repl_it;

import java.util.Scanner;

public class MiddleThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();



     if (length % 2 !=0 && length>=5) {

         int lengthHalf = word.length()/2;

         String middleThree = word.substring(lengthHalf-1,lengthHalf+2);

         System.out.println(middleThree);


     } else {


         System.out.println("invalid");

     }


    }
}
