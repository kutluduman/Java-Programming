package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

//        Store this sentence in a variable msg
//        I struggle with Java I Like Java I love Java Everything is Awesome!
//                loop through each and every letter
//        1, print every other letter
//        meaning : skip a letter each time you go through the letter
//        0123456789
//        I struggle with  -->> Isrgl ih
//        USE CONTINUE FOR THIS TASK
//        2,  when you reach letter 'a' break the loop
//                OTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitve


        String msg = "I struggle with Java I like Java I love Java Everything is Awesome!";
        int charCount = msg.length();
        int lastCharIndex = charCount - 1;
        int count = 0;


        for (int idx = 0; idx <= charCount - 1; idx++) { // idx - index
//          or
            //           for (int idx = 0; idx <= lastCharIndex ; idx++) {

            if (idx % 2 == 1) {

                continue; // this line will skip the rest and move to next iteration


            }
                // storing each character as String
            String currentChar = msg.substring(idx,idx+1);
            // this is checking the currentChar is J or j
            if (currentChar.equalsIgnoreCase("J")) {

                break; // will stop the loop



            }

            System.out.println(idx + " index " + " current Char = " +currentChar); // printing index and the String
                                                                                // with break and continue

        }


    }

}