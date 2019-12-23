package day27;

import java.util.Arrays;

public class Multi_Dimensional_Arrays {

    public static void main(String[] args) {

        int [] arr1D = {1,2,3};
//                         0 1 2    0 1 2
        int[][] arr2D = { {1,2,3}, {4,5,6}  };
        // index             0         1


        System.out.println(arr2D.length); // 2 single dimensional arrays

        System.out.println();

        System.out.println(Arrays.toString(arr2D[0])); // index of 1st bracket

        System.out.println();

        System.out.println(Arrays.toString(arr2D[1])); // index of 2nd bracket

        System.out.println();

        System.out.println(arr2D[0][2]); // you do not have to use Arrays.toString to print out because we print out
                                            // value

        System.out.println();

        System.out.println(arr2D[1][1]); // this prints out the int value

        System.out.println();

        System.out.println(Arrays.toString(arr2D[1])); // this prints out all the array values

        System.out.println();

        System.out.println(Arrays.deepToString(arr2D)); // this prints out the whole multidimensional arrays









    }
}
