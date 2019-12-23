package repl_it;

import java.util.Scanner;

public class JavaCounter {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

      int charCount = word.length();
       int lastCharIndex = charCount-1;
        int count = 0 ;


       for (int x = 0 ; x<=lastCharIndex-3 ; x++) {



           if (word.substring(x,x+4).equals("java")) {

               count++ ;


           }

       }
        System.out.println(count);

    }
}
