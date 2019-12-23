package day12;



public class CorollaFanCarShopping {


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

        int budget = 40000 ;

        int carPrice = 30000 ;


        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla")  && carPrice <= budget) )  {

            System.out.println("Car Acquired ! ");


        } else {

            System.out.println("This is not what I am looking for");


        }









    }



}
