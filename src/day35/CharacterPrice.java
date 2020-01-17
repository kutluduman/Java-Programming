package day35;

public class CharacterPrice {

    public static void main(String[] args) {


        /**
         * Character class has lots of static methods
         * to perform actions on char values
         * isDigit, isLetter, isLetterOrDigit, isUpperCase ,isLowerCase
         * toUppercase, toLowerCase
         */

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit(' '));
        System.out.println(Character.isDigit('6'));

        String str = "A34B123C4X";

        // Get the number out of this String
        // and store it into Integer variable num;

        String numsInString = "";

        for (int i = 0; i < str.length(); i++) {


            if (Character.isDigit(str.charAt(i))) {

                System.out.println("String.charAt(" + i + ") = " + str.charAt(i));
                numsInString += str.charAt(i);

            }


        }

        Integer num = Integer.valueOf(numsInString);

        System.out.println("num = " + num);






    }
}
