package day30;

import java.util.Arrays;

public class SplitAndDefineTheSize {

    public static void main(String[] args) {


        String sentence = "I love Java Java Java";

        String[] sentenceSplit = sentence.split(" ",2);

        System.out.println("words array = " + Arrays.toString(sentenceSplit));





    }
}
