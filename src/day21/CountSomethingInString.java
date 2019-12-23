package day21;

public class CountSomethingInString {

    public static void main(String[] args) {

        // Find out the count of all the word lia in cases insensitive manner
        // I will go through each and every letter of the String  by 3 chars  '
        //                  --->> each 3 characters i can use substring(0,2) and so on
        //                  --->> going to 0 to two character before last char index  --->>> for loop

        // while i am going through each and every 3 characters
        // i will check whether current string i am looking at
        //  equals to <lia> in case insensitive     --->>>  currentCharacter.equalsIngnoreCase("lia")
        // if it is  I will add 1 to my counter
        //  if not  -->> just move on
        // perform this action until I reach two character before last character
        //  because last chance to get 3 characters is -->> 2 characters before last character


        String myName = "Amelia Israfil Hajitev Mehmet Hajitev Amelia Behlia Ashr ";
        int charCount = myName.length();
        int lastIndexOf= myName.length()-1;
        int counter = 0;

        for (int i = 0; i <= charCount-3 ; i++) {

            String currentChar = myName.substring(i,i+3);


            if (currentChar.equalsIgnoreCase("lia")) {

                System.out.println("Index of an is " +i);
                counter++;

            }


        }

        System.out.println("Count of Lia appearing is " + counter);




    }
}
