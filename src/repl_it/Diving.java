package repl_it;

import java.util.Scanner;

public class Diving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float total = 0.0f;
        float lowest = 0.0f;
        float highest = 0.0f;

        for (int i = 0; i < score.length; i++) {

            System.out.println("Enter score for judge" + score[i + 1] + ":");
            score[i] = input.nextFloat();

            if (i == 0) {

                highest = score[i];
                lowest = score[i];


            } else {

                if (lowest > score[i]) {

                    lowest = score[i];


                }

                if (highest < score[i]) {

                    highest = score[i];

                }

            }


        }

        for (int i = 0; i < score.length; i++) {

            if (score[i] != highest && score[i] != lowest) {

                total += score[i];

            }


        }

        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();
        total = (total*0.6f) * diff;


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);


    }

}