package day40;


public class HotMarketActions2 {


    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.company = "Apple";
        offer1.location = "San Francisco";
        offer1.salary = 96000;
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
        offer4.displayOfferDetails();


        // Add 2K to the Apple Offer

        offer1.salary = offer1.salary + 2000;
        offer1.salary += 2000;
        System.out.println("new apple salary = " + offer1.salary);

        // set the salary value of offer4 object to sum of all the offers

        offer4.salary = offer1.salary + offer2.salary + offer3.salary;

        offer4.displayOfferDetails();

        offer4.turnToFullTime();
        offer4.displayOfferDetails();

        offer4.changeLocation("New York");
        offer4.displayOfferDetails();



    }


}

