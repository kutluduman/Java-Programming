package day12;

import javax.swing.*;
import java.util.Scanner;

public class SeasonAction {


    public static void main(String[] args) {


        /*


        Task 5 :
        Create a String variable season

        Assign value by asking user question : Enter your season Please !!

        Check the season using if statements without caring about the case
         If Spring —>  Hiking , Navruz , Alergy Season , Cool weather
         If Summer —>> Pool , Swimming , Beach , Vacation
        If Fall —>>>  barbecue , riding bike , JUST CODE !!!! Halloween
        If Winter —>> CODE!!!!!! Ski , sledding , snowman


         */





        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season please ! ");

        String season = scan.next();


        if (season.equalsIgnoreCase("spring")) {

            System.out.println("Hiking, Navruz, Allergy Season");


        } else if (season.equalsIgnoreCase("summer")) {

            System.out.println("Pool, Swimming, Vacation");



        }else if (season.equalsIgnoreCase("winter")) {

            System.out.println("Snowman, ski, code");




        } else if (season.equalsIgnoreCase("fall")) {

            System.out.println("barbecue, bike , just code");




        } else {

            System.out.println("Wrong Season");


        }

    }


}
