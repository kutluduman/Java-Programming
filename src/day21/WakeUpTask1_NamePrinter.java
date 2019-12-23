package day21;


public class WakeUpTask1_NamePrinter {

    public static void main(String[] args) {

        // Given your name store in a variable myName as String
        // for example : String myName "My name is Yourname here" :

        //  1. Loop through each and every character, print them out like this :
        //          My--->y---->    n-->a-->m-->e--> and so on put arrow in between the character

        // 2. print the sentence by 2 character at a time
        // 3. print the sentence by 3 character at a time
        // 4. print the sentence by 4 character at a time


        String myName = "Gulay Demirel";
        int charCount = myName.length();
        int lastCharIndex = charCount - 1;

            // 1 char method
        for (int i = 0; i <= lastCharIndex; i++) {

            System.out.print(myName.substring(i, i + 1) + "->"); // substring method

            // System.out.print(myName.charAt(i) + "->"); // char at method


        }

        System.out.println("------");
        System.out.println("---2 chars ---");
        for (int x = 0; x <= lastCharIndex - 1; x++) {
            //for (int x = 0; x < charCount-2 ; x++) {

            String twoChar = myName.substring(x, x + 2);
            System.out.print(twoChar + "->");

        }
        System.out.println("------");
        System.out.println("---3 chars ---");
        for (int x = 0; x <= lastCharIndex - 2; x++) {
            //for (int x = 0; x < charCount-3 ; x++) {

            String threeChar = myName.substring(x, x + 3);
            System.out.print(threeChar + "->");

        }

        for (int i = 0; i <= charCount - 4; i++) {


            String fourChar = myName.substring(i, i + 4);

            System.out.println(fourChar + "->");


        }
    }

}
