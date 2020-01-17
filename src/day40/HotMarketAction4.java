package day40;

public class HotMarketAction4 {

    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.company = "Apple";
        offer1.location = "San Francisco";
        offer1.salary = 96000;
        offer1.isFullTime = true;
        
        String offer1AsStr = offer1.toString();
        System.out.println(offer1AsStr);

        // if you directly print out object, it will call toString() method automatically
        System.out.println(offer1); // this is what is automatically happening behind the scene
       


        Offer offer2 = new Offer();


        offer2.company = "Microsoft";
        offer2.location = "San Francisco";
        offer2.salary = 100000;
        offer2.isFullTime = true;
       

        Offer offer3 = new Offer();


        offer3.company = "Adobe";
        offer3.location = "Toronto";
        offer3.salary = 80000;
        offer3.isFullTime = true;
      
        
        
        
    }
}
