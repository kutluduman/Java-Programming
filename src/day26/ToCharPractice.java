package day26;

import java.util.Arrays;

public class ToCharPractice {

    public static void main(String[] args) {
        
        // 2 additional String method related to Array
        // toCharArray() , another is split(bysSomething)
        
        String survey = "Complete B15 Online 1 Month Survey" ;
        
        
        char[] surveyChars = survey.toCharArray();

      for (char  eachSurvey    : surveyChars   ) {


          System.out.print(eachSurvey);


      }

        System.out.println();
        System.out.println();

      int x = 0 ;


      while (   x < surveyChars.length ) {


          System.out.println(surveyChars[x]);
          x++;

      }

        System.out.println();



      for (int i = 0 ; i<surveyChars.length ; i++) {


          System.out.print(surveyChars[i]);



      }

        System.out.println();
        System.out.println();

        int y = 0 ;


        do {

            System.out.println(surveyChars[y]);
            y++;


        } while (y<surveyChars.length) ;
        
        
        
        
        
    }
    
    
}
