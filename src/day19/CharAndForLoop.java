package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has its corresponding ascii value
        // from ascii table

        int x = 'A'; //65
//        char myChar ; // e
//
//        System.out.println(x);
//        System.out.println(myChar);
//
//        System.out.println(++myChar); // giving the next character
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);

        for (char iChar = 'A' ; iChar<='Z' ; iChar++) {


            System.out.print(iChar + " ");


        }

        for (char reverseIChar = 'Z' ; reverseIChar>= 'A'; reverseIChar--){


            System.out.println(reverseIChar);
        }



    }
}
