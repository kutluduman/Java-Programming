package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] sentenceSplit = sentence.split(" ");

        for (String eachSentence : sentenceSplit) {

            System.out.println(eachSentence);

        }


    }


}
