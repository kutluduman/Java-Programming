package day12;

public class CorollaFanCarShopping_Version2_0 {


    public static void main(String[] args) {


        /*


        // Buy corolla(DOES NOT MATTER WHATS YOUR BUDGET)
        // or
        // Tesla (only if it's within the budget THIS CONDITION ONLY APPLY FOR TESLA)
        // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        //  once we take out the cloth
        // we check whether its toyota , if it's we buy it without checking the price
        // if it's not, we check if its a Tesla and also check whether it is within the budget
        // else we just say not what we are looking for



         */


        String carBrand = "Corolla" ;

        int carPrice = 30000 ;

        int budget = 40000;

        if (carBrand.equals("Corolla") ) {

            System.out.println("Corolla Car Acquired");

        } else if (carBrand.equals("Tesla") && carPrice <= budget )    {

            System.out.println("Tesla Car Acquired");


        } else {

            System.out.println("Not what I am looking for ! ");
        }



    }
}
