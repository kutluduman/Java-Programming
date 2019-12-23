package repl_it;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int charCount = str.length();
        int lastCharIndex = charCount-1 ;
        int count = 0 ;

      for (int x = 0; x<=lastCharIndex-1 ; x++) {


          if (str.substring(x,x+2).equals("hi")) {

              count++;


          }




        }


        System.out.println(count);



    }

}
