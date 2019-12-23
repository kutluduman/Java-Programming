package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        // a String variable declared and assigned value inside main method
        // It can be accessible in main method

        String season = "Winter";
        //       String season = "Summer"; // this does not work because they see each other


        decideSeasonAction("Summer");
        decideSeasonAction("Winter");
        decideSeasonAction("Fall");


    }

    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside method body

        switch (season) {

            case "Spring":

                System.out.println("Hiking");

                break;

            case "Summer":

                System.out.println("Swimming");

                break;

            case "Fall":

                System.out.println("Pumpkin");

                break;

            case "Winter":

                System.out.println("Skiing");

                break;

            default:

                System.out.println("Invalid season");
        }

    }


}
