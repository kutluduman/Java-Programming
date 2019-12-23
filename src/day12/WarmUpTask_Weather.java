package day12;

import java.util.Scanner;

public class WarmUpTask_Weather {


    public static void main(String[] args) {


        /*

        Create a variable to store the weather of your city right now :
        And write a if else if else statement to do following
        If Weather Sunny ——>>  Code in Sunny weather
        If Weather Rainy ——>>  Code in Rainy weather
        If Weather Cloudy  ——>>  Code in Cloudy weather
        If Weather Snowy  ——>>  Code in Snowy weather
        Else   —>> rain or shine just keep coding anyway !!!


         */



        Scanner scan = new Scanner(System.in);

        System.out.println("How is the weather at your city now ? ");

        String weather = scan.next();

        if (weather.equals("Sunny")) {

            System.out.println("Code in Sunny Weather");


        } else if (weather.equals("Rainy")) {


            System.out.println("Code in Rainy Weather");


        } else if (weather.equals("Cloudy")) {

            System.out.println("Code in Cloudy Weather");


        } else if (weather.equals("Cloudy")) {


            System.out.println("Code in Snowy Weather");

        } else {

            System.out.println("Rain or shine, just keep coding");
        }






    }
}