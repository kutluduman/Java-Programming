package office_Hour;

import java.util.Arrays;

import java.util.Scanner;

public class Practice_12_10_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter language that you know ");

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();

        String[] languages = {l1,l2,l3};


        System.out.println(Arrays.toString(languages)); // to string method


        System.out.println();


        System.out.println(languages[2]); // you print the last input the user entered

        System.out.println();

        for (String allLanguages : languages  ) { // for each loop

            System.out.println("Here is the languae : " + allLanguages);

        }

        System.out.println();


        // for loop backwards

        for (int i = 2; i>=0 ; i--) {

            System.out.println("Going backwards " + languages[i]);
            
        }

        System.out.println();

        // for loop

        for (int x = 0; x <languages.length ; x++) {

            System.out.println("Going in normal order " + languages[x]);

        }


    }
}


