package repl_it;

import java.util.Scanner;

public class ArrayLargestNumber2D {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];


        for (int i = 0; i <= rows - 1; i++) {

            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();

            }//end for cols
        }//end for rows


        //TODO write your code below

        int max = arr[0][0];


        for (int[] eachRow : arr) {

            for (int eachColumn : eachRow) {

                if (eachColumn > max) {

                    max = eachColumn;


                }


            }


        }

        System.out.println(max);


    }
}
