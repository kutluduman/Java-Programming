package day13;

public class String_Methods {

    public static void main(String[] args) {

   //  String actions that we already know so far


        // equals

        String s1 = "hello"; // hello is object, s1 refer, pointer
        System.out.println(s1.equals("abc"));



        // equalsIgnoreCase

        System.out.println(s1.equalsIgnoreCase("HELLO"));

        // toUpperCase method of String is used to make String all character uppercase


        System.out.println( s1 );
        System.out.println(  s1.toUpperCase()       ); //executing method or action to change the object

        // toLowerCase method of String is used to make String all character lowercase

        // object takes the action

        System.out.println(s1.toLowerCase());

        String name = "Kutluhan" ;

        System.out.println("My name is : " + name.toLowerCase());

        System.out.println("My name is : " + name.toUpperCase());

        // () we do not enter anything to the parentheses because we do not need external data for this variable

        // In order to get how many character we have inside String, we can use :
        // length method of String

        System.out.println(name.length());
        System.out.println(s1.length());


        int lengthOfStr = s1.length();

        if (lengthOfStr>4) {

            System.out.println("More than 4 character");
        } else {

            System.out.println("Not more than 4 character");

        }




    }


}
