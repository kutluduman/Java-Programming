package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

    public static void main(String[] args) {


        System.out.println("The Start");
        String name = "Furkan";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ? ");

        // we want to take different action according to
        // different type of exception happen during the program
        // We can have more than one catch block
        // to handle different types of exception
        // and take action according to the exception type at runtime


        try {
            int targetIndex = scanner.nextInt();
            System.out.println("number 100 char of name is " + name.charAt(targetIndex));
            System.out.println("End of try");


        } catch (StringIndexOutOfBoundsException e) {


            System.out.println("You are out of bound");
            System.out.println("Enter between 0 and " + name.length());

        } catch (InputMismatchException b) {


            System.out.println("Input mismatch, enter number");
            System.out.println("Here is what you get if you enter 0 " + name.charAt(0));
            // YOU CAN HAVE AS MANY CATCH BLOCK AS YOU WANT !!!!

        } catch (Exception e) {
            System.out.println("IF I DONT CATCH ABOVE 2 TYPES I WILL COME HERE!!!");
        }

        System.out.println("The End");


    }
}
