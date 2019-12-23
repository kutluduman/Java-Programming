package day15;

import java.util.Scanner;

public class Name_Checker_Task_1 {

    public static void main(String[] args) {

        /*
        Task 1 :
        Name checker :
        Declare a variable to store your name
        check whether you name length is less than 4
        if so print short Name
        if it is within 5-10
        if so print medium Name
        if it's more than 11
        print longer name
                ------------------------------
        check whether your name has either character a or e
        if so -->> name contains a or e
        if not -->> i dont have both a or e in my name
                -------------------
        */



        Scanner scan = new Scanner(System.in);

        System.out.println("Your name : ");

        String name = scan.next();
        int nameLength = name.length() ;
        System.out.println("nameLength = " + nameLength);



        if (nameLength<4 ) {

            System.out.println("Short Name");

        } else if (nameLength>=4 && nameLength<=11) {


            System.out.println("Medium Name");

        } else {

            System.out.println("Long Name");
        }



        if (name.contains("a") || name.contains("e")) {

            System.out.println("Name contains a or e "); // name contains is case senstive always

        } else {


            System.out.println("I do not have a or e");
        }









    }



}
