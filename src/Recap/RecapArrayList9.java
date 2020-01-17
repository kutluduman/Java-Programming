package Recap;

import java.util.ArrayList;
import java.util.List;

public class RecapArrayList9 {

    public static void main(String[] args) {

        // print two items at a time without repeating

        List<String> teamMates = new ArrayList<>();

        teamMates.add("Akbar");
        teamMates.add("Kuzzat");
        teamMates.add("Murodil");
        teamMates.add("Maruf");
        teamMates.add("Vasyl");
        teamMates.add("Muhtar");
        teamMates.add("Asiya");
        teamMates.add("Mike");
        teamMates.add("Guljannat");
        teamMates.add("Support Team");


        for (int i = 0; i <teamMates.size()-2 ; i+=2) {


            System.out.println(teamMates.get(i)+" "+teamMates.get(i+1));

        }


        System.out.println(teamMates);

    }
}
