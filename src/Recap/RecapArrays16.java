package Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RecapArrays16 {

    public static void main(String[] args) {

        // Single dimensional array :

        int[] arr1D = {1, 2, 3, 4};
        // index : 0,1,2,3 ---> ordered

        int arr1d[] = {1, 2, 3, 4}; // other way of declaring array

        int arr1[] = new int[]{1, 2, 3, 4}; // other way of declaring array

        System.out.println(arr1D[2]);// 3


        // initialize the size of 1D array:

        int[] arr = new int[3]; // this array can contain three values
        // [0,0,0] ----> its not empty

        System.out.println(Arrays.toString(arr));

        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 40;

        // Array's size is fixed


        System.out.println(Arrays.toString(arr));

        int[] numbers = {10, 20, 30, 40};

        for (int each : numbers) {

            if (each == 20) {

                continue; // ski[ every single statements after the continue
            }
            System.out.print("each = " + each + " ");  // break ----> exits the loop immediately

        }

        System.out.println();

        int[] nums = {100, 200, 300, 400};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 300) {

                break;

            }

            System.out.print(nums[i] + " ");

        }

        // Arrays Util Class : toString(), sort(), deepToString()

        // toString ---- converting single dimensional array to String
        // sort ---- sorting single dimensional array in ascending order
        // deepToString --- converting multidimensional array to String

        // sort();

        long[] lArr = {20, 400, 500, 300, 10, 20};

        Arrays.sort(lArr); //[10, 20, 20, 300, 400, 500]

        System.out.println("Arrays.toString(lArr) = " + Arrays.toString(lArr));

        // deepToString()

        int[][] arr2D = {{1, 2}, {3, 4}};
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));

        // print 3,4

        System.out.println("Arrays.toString()[] = " + Arrays.toString(arr2D[1]));

        // print 4

        System.out.println("arr2D[0][1] = " + arr2D[0][1]);


        // for loop :

        for (int[] singleD : arr2D) {

            for (int each : singleD) {

                System.out.print(each + " ");

            }

        }

    }

}
