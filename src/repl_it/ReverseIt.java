package repl_it;

import java.util.Scanner;

public class ReverseIt {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       int count = word.length();

       if (count==5) {


           for (int x=4 ; x>= 0 ; --x) {

               System.out.print(word.charAt(x));

           }



       } else if (count>5) {

           System.out.println("Too long!");


       } else if (count<5) {

           System.out.println("Too short!");

       }



    }


    }

