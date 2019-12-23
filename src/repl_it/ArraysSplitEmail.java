package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitEmail {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] allWords = email.split("@");
        int allWordsLength = allWords.length;

        int count = 0;

        for (int x = 0; x <email.length() ; x++) {

        char currentChar = email.charAt(x);

        if ((currentChar == '@')) {
            count++;

        }

    }

        if (count>2 || count < 1 ) {

            System.out.println("invalid email");

        } else {

            System.out.println("Email id: " +allWords[0]);
            System.out.println("Email domain: " +allWords[1]);


        }


}


}