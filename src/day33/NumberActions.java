package day33;

import java.util.Arrays;

public class NumberActions {

    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(10));
        System.out.println();

        System.out.println(build_GOT_Email("Jon", "Snow"));

        // you are given a variable fullName that has first name and last name
        // use this full name to generate GOT_Email

        System.out.println();

        String fullName = "Susan cure";
        // store this resulting email

        String[] fullNameSplit = fullName.split(" ");
        String herEmail = build_GOT_Email(fullNameSplit[0], fullNameSplit[1]);

        System.out.println(herEmail);


    }

    public static int getSumFrom1ToX(int x) {

        int sum = 0;

        for (int i = 1; i <= x; i++) {

            sum += i;

        }

        return sum;

    }

    public static String build_GOT_Email(String firstName, String lastName) {


        String email = firstName.charAt(0) + "" + lastName + "@NightWatch.com";


        return email;


    }

}
