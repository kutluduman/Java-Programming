package repl_it;

import java.util.Scanner;

public class Burger_Or_Chicken {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        String in = s.next();

        float price = 10.0f ;
        float sodaPrice = 2.0f;

        if (in.equals("burger") || in.equals("chicken")) {

            System.out.println(price);


        } else if (in.equals("soda")) {

            System.out.println(sodaPrice);

        }










    }

}
