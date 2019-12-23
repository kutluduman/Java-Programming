package day27;

import java.util.Arrays;

public class Multi_D_ArraysTask {

    public static void main(String[] args) {

        int[][] numbers = {{12,11,10,19}, {19,20,15}} ;
        int max = numbers[0][0];


        for (int i = 0; i <numbers.length ; i++) { // checks each single dimensional array


            for (int j = 0; j <numbers[i].length ; j++) {// check each elements in single dimension array


                if (max<numbers[i][j]) { // compares index 0 of the array with each indexes

                    max = numbers[i][j] ; // assigns max number

                }

            }


        }

        System.out.println(max);


        //

        System.out.println();


        //Finding maximum with Loop each

        int max2 = numbers[0][0];

        for (int[] each1DArray  : numbers   ) { // variable each1DArray represents each single dimensional Array
                                                    // in numbers


            for ( int eachElements  :  each1DArray ) {

                    if (max2< eachElements) {
                        
                        max2=eachElements;

                    }
           
            }

        }

        System.out.println("max2 = " + max2);

        System.out.println();


        // finding minimum:
        
        int minimum = numbers[0][0];

        for (int[] each1DArray   :  numbers    ) {

            for (int eachInt   :  each1DArray    )        {
                
                if (minimum>eachInt) {
                    
                    minimum=eachInt;
                    
                }
                
            }
            
            
        }

        System.out.println("minimum = " + minimum);

        System.out.println();
        // Another Method to Find Minimum

        int min = numbers[0][0];

        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {

                if (min>numbers[i][j]) {

                    min=numbers[i][j];

                }

            }

        }

        System.out.println("min = " + min);

        System.out.println();



    }
}
