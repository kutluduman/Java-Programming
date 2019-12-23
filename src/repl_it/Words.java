package repl_it;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Give two words:");

        String word1 = scan.next() ;
        String word2 = scan.next() ;

        if (word1.equalsIgnoreCase(word2)) {


            System.out.println("word1 equals word2" );


        } else {


            System.out.println("word1 does not equal word2");
        }







    }
}
