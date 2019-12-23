package day21;

public class SearchingSomethingInString_1Char {

    public static void main(String[] args) {

        // Find out index of all the letter a in cases insensitive manner
        // I will go through each and every letter of the String   '
        //                  --->> each character i can use substring(0,1) and so on
        //                  --->> going to 0 to last index  --->>> for loop

        // while i am going through each and every character
        // i will check whether current character i am looking at
        //  equals to a or A     --->>>  currentCharacter.equalsIngnoreCase("a")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach last character   if i go over last character index i stop


        String myName = "Daria Ozer";
        int charCount = myName.length();
        int lastCharIndex = charCount - 1;



        for (int i = 0 ; i <= lastCharIndex ; i++ ) {

            String currentChar= myName.substring(i,i+1);


            if (currentChar.equalsIgnoreCase("a")) {

                System.out.println("The index of a or A is " + i);




            }


        }




    }


}
