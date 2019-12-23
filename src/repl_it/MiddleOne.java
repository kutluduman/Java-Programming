package repl_it;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();
        String middle = ""+word.charAt((word.length()-1) /2);
        String middleTwo = ""+word.charAt((word.length()-1) /2)+""+word.charAt(word.length()/2);


        if (length%2 !=0 && length>=3) {

            System.out.println(middle);


        } else if (length==1 ) {

            System.out.println(word+""+word+""+word);

        } else if (length%2 ==0 && length>=4) {

            System.out.println(middleTwo);


        } else if (length==2) {

            System.out.println(word+""+word);


        }



    }
}
