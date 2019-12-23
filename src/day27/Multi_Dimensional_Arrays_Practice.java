package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

       String[][] names = { {"Rukhshona", "Ghoya" } , {"Hasan", "Tatiana" }  };


        System.out.println("Printing all the names : " + Arrays.deepToString(names));

        System.out.println();

        System.out.println("Print Hasan from the Array : " +names[1][0]);

        System.out.println();

        System.out.println("Print Tatiana : " +names[1][1]);

        System.out.println();

        // how about bring another name instead of Tatiana

        names[1][1] = "Dilshod";

        System.out.println(names[1][1]);

        System.out.println();

        System.out.println("Print Hasan and Dilshod" + Arrays.toString(names[1])); // use toString only for one Array


        System.out.println();


        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        for (int i = 0; i <numbers.length ; i++) { // checks each index of two dimensional arrays

  //          System.out.println(Arrays.toString(numbers[i]));


            for (int j = 0 ; j <numbers[i].length ; j++) { // checks each elements of single arrays

                System.out.print(numbers[i][j]+ " ");

            }

        }


        System.out.println();
        System.out.println();

        int [][] ages = {{10},{12,13,14,16,17},{19,20,21,22,23}};

        for (int i = 0; i <ages.length ; i++) {

            for (int j = 0 ; j<ages[i].length ; j++) {

                if (ages[i][j]%2== 0) {

                    System.out.print(ages[i][j] + " ");



                }

            }

        }

        System.out.println();
        System.out.println();

        int[] arr1D = {1,2,3};



        for (int each  : arr1D    ) {

            System.out.print(each + " ");




        }

        System.out.println();
        System.out.println();

        int[][] arr2D = {{10,20,30},{40,50,60,70,80,90,100}};

        for (int[]  each1DArray   : arr2D   ) { // represents each index of the 2nd Array

 //           System.out.print(Arrays.toString(each1DArray) + " ");



            for (int each : each1DArray) { // represents each element

                System.out.print(each+ " ");



            }



        }



    }


}
