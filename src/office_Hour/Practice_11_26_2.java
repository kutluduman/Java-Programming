package office_Hour;

public class Practice_11_26_2 {

    public static void main(String[] args) {


        // spring, summer , fall -------> print bear are active
        // winter =====> print bear sleep :

        String season = "spring";

//        if (season.equals("spring")) {
//
//            System.out.println("Bear is active");
//
//        } else if (season.equals("summer")) {
//
//            System.out.println("Bear is active");
//        } else if (season.equals("winter")) {
//
//            System.out.println("Bear is sleep");


        //   }


//        if (season.equals("summer") || season.equals("fall") || season.equals("spring") {
//
//            System.out.println("Bear is active");
//        } else if (season.equals("winter")) {
//
//            System.out.println("bear is sleeping");
//        }


        switch (season) {

            case "spring":

  //              System.out.println("bear is active");

  //              break;

            case "summer":

 //               System.out.println("bear is active");

//                break;

            case "fall":

                System.out.println("bear is active");

                break;

            default:

                System.out.println("bear is sleeping");


                // this is the cleanest and shortest way

        }


    }
}
