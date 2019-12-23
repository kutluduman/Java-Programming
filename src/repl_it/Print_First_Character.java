package repl_it;

import java.util.Scanner;

public class Print_First_Character {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        char firstLetter = word.charAt(0) ;

        System.out.println(firstLetter);







    }

}
