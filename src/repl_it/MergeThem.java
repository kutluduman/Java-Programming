package repl_it;

import java.util.Scanner;

public class MergeThem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        int length1 = word1.length();
        int length2 = word2.length();

        String merge = ""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)
                +word2.charAt(2);


        if (length1 !=3 && length2 !=3) {


            System.out.println("cannot merge");

        } else if (length1 ==3 && length2 ==3 ) {

            System.out.println(merge);

        } else {
            System.out.println("cannot merge");

        }






    }
}
