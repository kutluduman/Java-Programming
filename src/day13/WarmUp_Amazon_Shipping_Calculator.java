package day13;

public class WarmUp_Amazon_Shipping_Calculator {

    public static void main(String[] args) {


        /*

        Amazon has 2 type of user, one is prime member and the other is regular member
        prime member get free shipping in all purchase no matter the amount
        regular member user get free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping fee


         */

        String memberType = "Prime member";
        double amount = 15.99d;
        int shippingFee = 0;


        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {

            System.out.println("You get 1 day Free Shipping!");
            System.out.println("Your final price is " + amount);

        } else if ((!memberType.equalsIgnoreCase("PRIME MEMBER") && amount > 25)) {

            System.out.println("Not a Prime Member but your order is more than 25");
            System.out.println("You got Free Shipping on Amount" + amount);


        } else if (amount > 25) {

            System.out.println("Not a Prime Member but your order is more than 25");
            System.out.println("You got Free Shipping on Amount" + amount);


        } else {


            System.out.println("Do you want to sign up  for Prime Membership ?");
            shippingFee = 5;
            amount = shippingFee + amount;

            System.out.println("Your final amount is " + amount);

        }


    }


}
