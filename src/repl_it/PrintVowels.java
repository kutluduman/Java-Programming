package repl_it;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();


        for (int x = 0; x < word.length(); ++x) {



            if (word.charAt(x) == 'a'||word.charAt(x) == 'e'||word.charAt(x) == 'i'
                    ||word.charAt(x) == 'o'||word.charAt(x) == 'u')  {


                System.out.print(word.charAt(x));


            }

        }
    }
}