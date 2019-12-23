package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        String order = "";
        int itemNumber = 2 ;

        switch (itemNumber) {

            case 1 :

                order = "Burger";
                System.out.println("Your order is " + order);

                break;

            case 2 :

                order = "Nuggets";
                System.out.println("Your order is " + order);

                break;

            case 3 :

                order = "Coke";
                System.out.println("Your order is " + order);

                break;

            case 4 :

                order = "Coke";
                System.out.println("Your order is " + order);

                break;

            case 5:

                order = "Ice Cream";

                System.out.println("Your order is " + order);

                break;

            default:
                System.out.println("Unknown Order");



        }


        System.out.println("Thanks for visiting us.");


    }



}
