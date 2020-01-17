package day40;

public class HotMarketActions3 {

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


        offer1.changeAllInfo("Amazon", "Virginia",
                150000l, true);


            // if this guy ear more than 100k
            // move him to Atlanta



            if (offer1.is100KOffer()) {

                offer1.changeLocation("Atlanta");


            }

            offer1.displayOfferDetails();




    }
}
