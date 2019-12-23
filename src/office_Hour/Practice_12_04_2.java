package office_Hour;

import java.util.Scanner;

public class Practice_12_04_2 {

    public static void main(String[] args) {

       // REPL QUESTION 64:



//        You have a word, do the following:
//
//        1. When word has odd number of characters and:
//        - 3 or more characters, print middle letter
//        oak ==> a
//        javav ==> v
//                - Single character, print that character 3 times
//      # ==> ###
//        q ==> qqq
//
//        2. When word has even number of characters and:
//        - 4 or more characters, print middle 2
//        java ==> av
//        apples ==> pl
//     #$%^&* ==> %^
//        - 2 characters, print those 2 characters twice
//        @@ ==>@@@@
//                $$ ==>$$$$
//        hi ==> hihi


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int charCount = word.length();

        if (charCount==1) {

            System.out.println(word+word+word);


        } else if (charCount==2)  {

            System.out.println(word+word);


        }  else if (charCount>=3) {

            if (charCount % 2 == 1) {


                System.out.println(word.charAt(word.length() / 2));

            } else if (charCount>=4) {

                if (charCount%2==0) {

                    System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));
                }
            }


        }
    }
}


