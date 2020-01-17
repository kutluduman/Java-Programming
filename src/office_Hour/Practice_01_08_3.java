package office_Hour;

import day31.SeasonChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_01_08_3 {

    public static void main(String[] args) {


        /**
         *
         * Given a ArrayList of 10 String(yes String) as scores "79" , "54" , "100", "65", "44"....
         * * print pass if its more than 60 fail if not
         * * count how many score are more than 90
         * * get the average score
         * * update the values with score-grade pair
         *   for example
         * 79C , 54F, 100A, 65D, 44F , 89B , 95A
         * Optionally create 4 methods according to above criteria
         *
         */

        // this is the short way to create list that non-resizable
        List<String> numlist = Arrays.asList("79", "54", "100", "65", "44", "78", "68", "98", "89", "77");

        System.out.println("numlist = " + numlist);

        for (String each : numlist) {


            int eachNumber = Integer.parseInt(each);

            if (eachNumber > 60) {

                System.out.println("Pass");
            } else {

                System.out.println("Fail");

            }


        }


        int count = 0;


        for (String each : numlist) {

            if (Integer.parseInt(each) > 90) {

                count++;


            }


        }

        System.out.println("count = " + count);

        int sum = 0;

        for (String each : numlist) {

            sum += Integer.parseInt(each);


        }

        System.out.println("average = " + sum / numlist.size());


        for (int i = 0; i < numlist.size(); i++) {


            if (Integer.parseInt(numlist.get(i)) > 100 || (Integer.parseInt(numlist.get(i)) < 95)) {

                numlist.set(i, numlist.get(i) + 'B');


            } else if (Integer.parseInt(numlist.get(i)) > 89 || (Integer.parseInt(numlist.get(i)) < 94)) {

                numlist.set(i, numlist.get(i) + 'B');


            } else if (Integer.parseInt(numlist.get(i)) > 79) {

                numlist.set(i, numlist.get(i) + 'C');

            } else if (Integer.parseInt(numlist.get(i)) > 65) {

                numlist.set(i, numlist.get(i) + 'D');

            }

        }


    }

}
