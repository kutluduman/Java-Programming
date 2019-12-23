package day27;

import java.util.Arrays;

public class MultiDimensionalArrays_3D {

    public static void main(String[] args) {

            //2D Array : Contains 1D Array
        int [][] arr2D = {{1,2,3}, {4,5,6}} ;

    // 3D Array : Contains 2D Array

        int[][][] arr3D = {  {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}} };
                                // 0                      1


        // print 9 ;

        System.out.println(arr3D[1][0][2]); // returns value

        System.out.println();

        // print 2 ;

        System.out.println(arr3D[0][0][1]); // returns value

        System.out.println();

        // print {1,2,3}

        System.out.println(Arrays.toString(arr3D[0][0]));  // returns 1d Array

        System.out.println();

        // print {10,11,12}

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println();

        // print {{7,8,9} , {10,11,12}}


        System.out.println(Arrays.deepToString(arr3D[1])); // as it contains more arrays

        System.out.println();





    }


}
