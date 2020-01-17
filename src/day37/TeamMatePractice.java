package day37;

import java.util.ArrayList;
import java.util.List;

public class TeamMatePractice {

    public static void main(String[] args) {

        /**
         * Warm up:
         * Create ArrayList of String and store
         * teamMates
         * print one by one
         * print reverse
         * print first last
         * print 2 at a time
         * concat everyone in one string separated by -
         */


//        ArrayList<String> teamMates = new ArrayList<>();
        System.out.println();

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
        teamMates.add("Support team");

        System.out.println(teamMates);


        // first and last item :
        System.out.println();

        System.out.println("First item : " + teamMates.get(0));
        System.out.println("Last item : " + teamMates.get(teamMates.size() - 1));


        // Get each item :

        System.out.println();

        for (int i = 0; i < teamMates.size(); i++) {

            System.out.println("Item " + (i + 1) + " = " + teamMates.get(i));


        }

        // Reverse :
        System.out.println();

        for (int i = teamMates.size() - 1; i >= 0; i--) {

            System.out.println("Reverse " + (i + 1) + " = " + teamMates.get(i));

        }

        // print two items at a time :
        System.out.println();

        for (int x = 0; x <= teamMates.size() - 2; x++) {

            System.out.println(teamMates.get(x) + " " + teamMates.get(x + 1));


        }


        // print without repetition :
        System.out.println();

        for (int x = 0; x <= teamMates.size() - 2; x += 2) {

            System.out.println(teamMates.get(x) + " " + teamMates.get(x + 1));


        }

        // concatenate with -
        System.out.println();

        String result = "";

        for (int x = 0; x < teamMates.size(); x++) {

            result += teamMates.get(x) + "-";


        }

        System.out.println(result.substring(0, result.length() - 1)); // removing last dash


        // Turn list into a String and store it and manipulate
        System.out.println();

        String lstToString = teamMates.toString();

        System.out.println("After replacing " + lstToString.replace(", ", " - ")
                .replace("[", "").replace("]", ""));

        System.out.println();


    }
}
