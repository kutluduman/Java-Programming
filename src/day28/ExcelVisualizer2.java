package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {

    public static void main(String[] args) {

        int[][] myExcel = { // this is the beginning of the 2D array object
                            {10,27,88,99}, //index 0 first 1D array
                            {87,100}, //index 1 second 1D array
                            {90,45,65}    // index 2  third 1D array
                        };// this is the ending of the 2D array object

        // what does deepToString method do :
        // it takes an multiD array and turn it into a String with all items
        // what external data do we provide
        // the multiD array object or the multiD array variable
        // what do i get out of it
        //  --->> String representation of multiD array object


        System.out.println(Arrays.deepToString(myExcel));


        for (int[] eachRow :  myExcel  ) {

            for (int each1D    : eachRow   ) {

                System.out.print(each1D+ " ");

            }




        }



    }
}
