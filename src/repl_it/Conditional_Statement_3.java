package repl_it;

import java.util.Scanner;

public class Conditional_Statement_3 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();

        if (name.equalsIgnoreCase("Chen")) {


            System.out.println("teacher");
        } else  {

            System.out.println("student");
        }



    }




}
