package day26;

import java.util.Arrays;

public class ToCharPracticeWithArraysClassMethod {

    public static void main(String[] args) {
        
        // 2 additional String method related to Array
        // toCharArray() , another is split(bysSomething)
        
        String survey = "Complete B15 Online 1 Month Survey" ;
        
        char[] surveyChars = survey.toCharArray();
        System.out.println("Before surveyChars : " +Arrays.toString(surveyChars) );


        System.out.println();

        Arrays.sort(surveyChars);

        System.out.println("After surveyChars : " +Arrays.toString(surveyChars));




    }
    
    
}
