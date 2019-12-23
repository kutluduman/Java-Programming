package repl_it;

import java.util.Scanner;

public class Verify_Contains {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();



        boolean gotWord = sentence.contains(word);

        System.out.println(gotWord);





    }


}
