package repl_it;

import java.util.Scanner;

public class Verify {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        boolean wordSentence = sentence.contains(word);

        System.out.println(wordSentence);






    }
}
