package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's your oder? I want the same! ");

        String yourOrder = scan.nextLine();
        String myOrder =    yourOrder     ;

        System.out.println("Your oder is " + yourOrder + "\n" + "My order is " + myOrder);



    }
}
