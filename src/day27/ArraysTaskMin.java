package day27;

import java.util.Arrays;

public class ArraysTaskMin {

    public static void main(String[] args) {

        //Task02
        //Find the minimum number from an int array


        int[] scores = {100,867,654,32,1231,224,556,7,1,2,3,4} ;

        Arrays.sort(scores);

        int min = scores[0];

        System.out.println("min = " + min);

        System.out.println("==========================================");

        //without sort method :

        int minWithoutSort = scores[0]; // we give the largest number to compare

        for (int i = 0; i <scores.length ; i++) {

            if (minWithoutSort>scores[i]) {

            minWithoutSort=scores[i];

            }



        }

        System.out.println("Minimum value by not using sort method is : " +minWithoutSort);


        System.out.println("==========================================");


        int secondMin = scores[2];

        for (int i = 0; i <scores.length ; i++) {


            if (scores[i]==min) {

                continue;

            }

            if (secondMin>scores[i]) {

                secondMin=scores[i];

            }

        }

        System.out.println("Second min is : " + secondMin);

        System.out.println("==========================================");

        int thirdMin = scores[2];

        for (int i = 0 ; i<scores.length ; i++) {

            if (scores[i]==min || scores[i] ==secondMin) {
                continue;


            }

            if (thirdMin>scores[i]){

                thirdMin=scores[i];


            }


        }

        System.out.println("Third minimum is " + thirdMin);


    }
}
