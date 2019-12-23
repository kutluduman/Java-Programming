package day21;

public class SearchingSomethingInString_3Char {

    public static void main(String[] args) {

        // Find out index of all the letter a in cases insensitive manner
        // I will go through each and every letter of the String   '
        //                  --->> each character i can use substring(0,1) and so on
        //                  --->> going to 0 to last index  --->>> for loop

        // while i am going through each and every character
        // i will check whether current character i am looking at
        //  equals to lia    --->>>  currentCharacter.equalsIngnoreCase("lia")
        // if it is  I will print the index     println ( the variable you use to keep the index )
        //  if not  -->> just move on
        // perform this action until I reach last character   if i go over last character index i stop



        String myName = "Amelia Israfil Hajitev Mehmet Hajitev Amelia Behlia Ashr ";
        int charCount = myName.length();
        int lastIndexOf= myName.length()-1;


        for (int i = 0; i <= charCount-3 ; i++) {

            String currentChar = myName.substring(i,i+3);


            if (currentChar.equalsIgnoreCase("lia")) {

                System.out.println("Index of an is " +i);

            }


        }






    }
}
