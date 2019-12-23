package day07;

import java.util.Scanner;


public class EmailBuilderScanner {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter your first name, last name, company seperated by space :");

        String firstName, lastName, company, email ;
        firstName = scan.nextLine();
        lastName = scan.nextLine();
        company = scan.nextLine();
        email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println("My name is " + firstName + " " + lastName + " and I work for " + company + " and my email is " + email);



    }



}
