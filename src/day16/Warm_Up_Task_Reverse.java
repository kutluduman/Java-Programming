package day16;

import java.util.Scanner;

public class Warm_Up_Task_Reverse {

    public static void main(String[] args) {


        /*

        Given a word with 4 characters stored in a String variable word1,
        Create a String variable called word2.
        Store the reversed word1 into word2 and print it out.
       Example:
        word1 == JAVA
        word 2 == avaJ

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string word");
        String word = scan.next();
        String word2= "";

        // in order to reverse a word, we need to take the last character and put in first character
        // then put the seconds character at 1 location before first character
        // start getting character frm last location till first location then save it

  //      String word2 = ""+word.charAt(3) +  word.charAt(2) + word.charAt(1) + word.charAt(0);

        // or

        word2 = word2 +word.charAt(3) +  word.charAt(2) + word.charAt(1) + word.charAt(0);








    }
}
