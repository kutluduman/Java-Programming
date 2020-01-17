package day40;



import java.util.ArrayList;

public class HotMarketActions {


    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.company = "Apple";
        offer1.location = "San Francisco";
        offer1.salary = 90000;
        offer1.isFullTime = true;
        offer1.displayOfferDetails();


        Offer offer2 = new Offer();


        offer2.company = "Microsoft";
        offer2.location = "San Francisco";
        offer2.salary = 100000;
        offer2.isFullTime = true;
        offer2.displayOfferDetails();

        Offer offer3 = new Offer();


        offer3.company = "Adobe";
        offer3.location = "Toronto";
        offer3.salary = 80000;
        offer3.isFullTime = true;
        offer3.displayOfferDetails();

        Offer offer4 = new Offer();

        offer4.company = "Samsung";
        offer4.location = "Korea";
        offer4.salary = 120000;
        offer4.isFullTime = true;
        offer4.displayOfferDetails();

        Offer offer5 = new Offer();

        offer5.company = "Nokia";
        offer5.location = "Ottawa";
        offer5.salary = 110000;
        offer5.isFullTime = true;
        offer5.displayOfferDetails();


        /*
            Creating ArrayList of Offer to store multiple offer objects

         */

        ArrayList<Offer> listOffers = new ArrayList<>();


        listOffers.add(offer1);
        listOffers.add(offer2);
        listOffers.add(offer3);
        listOffers.add(offer4);
        listOffers.add(offer5);

        System.out.println("listOffers = " + listOffers);


        for (Offer each : listOffers) {

            each.displayOfferDetails();


        }


        for (int x = 0; x < listOffers.size(); x++) {

            // store each item to a variable each

            Offer each = listOffers.get(x);
            each.displayOfferDetails();

            // one shot version
            listOffers.get(x).displayOfferDetails();


        }





            /*


         if we don't assign values for instance field/variable
         we get default value
         for primitive numbers : 0 or 0.0
         boolean false
         char '';

         For any reference types ;

                 null

         */


    }
}
