package day11;

public class StringEqualityPractice {


    public static void main(String[] args) {

        // checking for string equality should always
        // done using equals method of the String
        // oneString.equals(anotherString) ------> true or false


        System.out.println("Java".equals("java"));


        String myStr = "Java" ;

        System.out.println( myStr.equals("Java"));

        String yourStr = new String("Java");

        System.out.println("is my string same as your string ? ");
        System.out.println(myStr.equals(yourStr));

        // Create a program to check whether myStr value is Java
        // if yes, say: CORRECT WORD
        // if no, say JAVA!!!!


        if (myStr.equals("Java")) {

            System.out.println("Correct Word");


        } else {

            System.out.println("JAVA!!!");

        }

    }


}
