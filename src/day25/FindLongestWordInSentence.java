package day25;

import java.util.Arrays;

public class FindLongestWordInSentence {

    public static void main(String[] args) {


        String sentence = "We All Love Java Coding intensively all the time";

        String[] allWords = sentence.split(" ");

        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(allWords));

        System.out.println();

        String longestWorld = "";

        int maxCharCount = 0 ;

        // first create a String variable longestWord to store my result
        //  also create maxCharCount variable to store my longest char count
        // I want to go through each and every word in string array
        // and check whether the length of current word is more than longestWord
        // if it's I will assign the longest word value to current word i am looking at

        // assume the first word is the longest word before checking

        for (String currentWord   : allWords ) {

            System.out.println("currentWord = " + currentWord);

            if (currentWord.length()> longestWorld.length()) {

                longestWorld=currentWord;


            }



        }

        System.out.println();

        System.out.println("longestWorld = " + longestWorld);



    }
}
