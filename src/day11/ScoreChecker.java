package day11;

public class ScoreChecker {

    public static void main(String[] args) {

        /*

        if the score is less than 0 or more than 100 -----> invalid score
        if the score is 100 -----> perfect score
        if the score is between 7-100 ------> you have passed

       else you have failed

       less than 20 come to my office
       30-40 attend additional class
       40-70 little bit more study wil let you pass



         */


        int score = 10;


        if (score < 0 || score >100) { // we use || because a number cannot be below zero

            System.out.println("Invalid Score");


        }else if (score == 100) {

            System.out.println("Perfect Score");


        } else if ( score>=70 && score<=100) {

            System.out.println("You have passed");

        } else if ( score>=30 && score<=40) {

            System.out.println("Attend additional classes");

        } else if  ( score>=40 && score<=70) {

            System.out.println("Study little bit more to pass");


        } else if ( score <20 ) {

            System.out.println("Come to my office");


        }    else {

            System.out.println("You have failed");
        }







    }


}
