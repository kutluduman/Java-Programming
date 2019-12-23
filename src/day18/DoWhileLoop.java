package day18;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock Knock");
        System.out.println("Whats the Password");
        String password ;


        do {
            System.out.println("Whats the password ? ");
            password = scan.next();

        } while (!password.equals("B15")) ;

        System.out.println("Door is open");





    }
}
