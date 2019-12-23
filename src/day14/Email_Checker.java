package day14;

import java.util.Scanner;

public class Email_Checker {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email : ");

        String email = scan.next();

        boolean containEmailSign = email.contains("@");

        boolean containSpace = !email.contains(" ");



        if ( !email.contains("@") || email.contains(" ")) {

            System.out.println("Invalid Email");

        } else if (email.endsWith("gmail.com"))  {

            System.out.println("Google Mail");

        }else if (email.endsWith("yahoo.com")) {

            System.out.println("Yahoo Mail");

        } else if (email.endsWith("mail.ru")) {

            System.out.println("Russian Mail");

        }







    }
}
