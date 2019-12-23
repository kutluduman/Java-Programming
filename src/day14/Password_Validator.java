package day14;

import java.util.Scanner;

public class Password_Validator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write your Password : ");
        String password = scan.nextLine();


        // Minimum 8 Char and max 16 Char
        // password.length()

        // It must contain _ or $
        //password.contains



        //It must not contain space
        //! password.contains(" ")



        // It must start with AB
        // password.startswith "Ab"



        boolean min8Max16 = password.length()>=8 && password.length()<=16 ;

        boolean must_$ = password.contains("$") || password.contains("_") ;

        boolean noSpace = ! password.contains(" ") ;

        boolean startWithAb = password.startsWith("Ab") ;

        if (min8Max16 && must_$ && noSpace && startWithAb) {

            System.out.println("Valid Password");


        } else {

            System.out.println("Invalid Password");
        }






    }


}
