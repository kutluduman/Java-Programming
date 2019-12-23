package day21;

public class SearchingSomethingInString_2Char {

    public static void main(String[] args) {

        // Find out index of all the letter a in cases insensitive manner
        // I will go through each and every letter of the String   '
        //                  --->> each character i can use substring(0,1) and so on
        //                  --->> going to 0 to last index  --->>> for loop

        // while i am going through each and every character
        // i will check whether current character i am looking at
        //  equals to an      --->>>  currentCharacter.equalsIngnoreCase("an")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach last character   if i go over last character index i stop


        String myName = "Kutluhan ";
        int charCount = myName.length();
        int lastIndexOf= myName.length()-1;


        for (int i = 0; i <= charCount-2 ; i++) {

            String currentChar = myName.substring(i,i+2);


            if (currentChar.equalsIgnoreCase("an")) {

                System.out.println("Index of an is " +i);

            }


        }






    }
}
