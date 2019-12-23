package office_Hour;

import java.util.Scanner;

public class Practice_11_26 {

    public static void main(String[] args) {

        /*

        Pseudo Code :


        you have option to buy food or drink, under food you can buy meal or
        snacks.
                Under drink you can buy soda or juice

        IF your selection is food:

        If you want food, what kind you want? Meal or snack

        If your selection is drink:

        What kind do you want? Soda or juice

                */

        Scanner scan = new Scanner(System.in);
        System.out.println("You want food or not ? ");

        String mainOptions = scan.next();



        if (mainOptions.equalsIgnoreCase("food")) {

            System.out.println("You selected food ");

            System.out.println("You want meal or snack ? ");
            String secondaryOptions = scan.next();

            if (secondaryOptions.equalsIgnoreCase("snack")) {

                System.out.println("You have selected Snack");

            } else if (secondaryOptions.equalsIgnoreCase("meal")) {

                System.out.println("You have selected meal");
            } else {

                System.out.println("No such food option");
            }


        }



    }

}
