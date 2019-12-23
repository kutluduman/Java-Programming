package day10;

public class SeasonAction {

    public static void main(String[] args) {

        String season = "Summer";

        switch (season) {

            case "Spring" :

                System.out.println("You chose: " + season + ": HIKE, Easter, Nawruz, Blossom");

                break;

            case "Summer" :

                System.out.println("You chose: " + season + ": Swim, Vacation, BBQ, Holiday");

                break;

            case "Fall" :

                System.out.println("You chose: " + season + ": Black friday, hiking, harvest, halloween, shopping");

                break;

            case "Winter" :

                System.out.println("You chose: " + season + ": Snowboarding, Ski, Christmas, New Year");

                break;

            default:
                System.out.println("You did not chose a season");

                break;


        }





    }
}
