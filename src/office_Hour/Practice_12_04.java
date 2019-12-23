package office_Hour;

import java.util.Scanner;

public class Practice_12_04 {

    public static void main(String[] args) {

        //  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first word with single character to start with");
        String first = scan.next();
        char firstChar = first.charAt(0);

        System.out.println("Enter second word with single character to end with");
        String second = scan.next();
        char secondChar = second.charAt(0);


  //      for (char iChar = firstChar ; iChar<=secondChar; iChar++) {

        // what if you want to print the between of these characters

            for (char iChar = (char)(firstChar+1) ; iChar<secondChar ; iChar++) {

            System.out.print(iChar);



        }





    }
}


