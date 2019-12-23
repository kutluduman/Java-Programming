package repl_it;

import java.util.Scanner;

public class HasAJava {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


      if ( word.indexOf("java") == 0 || word.indexOf("java") ==1) {

          exists = true;

          System.out.println(exists);




      } else {

          exists= false ;

          System.out.println(exists);
      }








    }
}
