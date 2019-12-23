package office_Hour;

import java.util.Arrays;

public class Practice_12_09 {

    public static void main(String[] args) {

//        **********

        int num = 9;

        num = 15 ;

        System.out.println(num);

        System.out.println();

        int[] nums = new int[4];

        nums[0] = 5;
        nums[1]= num;
        nums[2]= 25;
        nums[3]=22;

        System.out.println(Arrays.toString(nums)); // toString is a method which returns human readable information
                                                    // arrays


        System.out.println();


        System.out.println("How many numbers in array? " + nums.length); // property that returns the number of returns or variables I have.
                                            // number of things I have in the array

        // in arrays, we put .length not parenthesis because it's a property on the other hand in String method, you
        // put .length() because it's a method

        //Arrays are the collection of data

        // be careful about the size of Arrays. It should not exceed the size


        System.out.println();


        // When we want to get some value from array, we provide index which starts from 0.

        System.out.println(nums[1]); // this is the second number in the array. Index 1 is the second because it starts
                                            // from zero


        //if I want to get the last value from array;
        //length returns number of values in array
        //length-1, index of last value in array

        System.out.println();

        System.out.println("Last value in Array : "+nums[nums.length-1]);

        System.out.println();


        // how to find the middle value?

        System.out.println("The middle value is " + nums[nums.length/2]);


        System.out.println();

        // Finding the middle in odd numbers:

        int[] newNums = new int[] {1,3,4,5,7} ;

        System.out.println("Middle of odd numbers : " + newNums[newNums.length/2] );

        System.out.println();

        // how to find the biggest number?

        int max  = newNums[0]; // we initialize the first value in the array as max and then compare with loop
        int secondMax = max ;


        for (int i = 0; i <newNums.length ; i++) {

            // if any value is greater than the current max
            if (newNums[i]>max) {


                // change max variable to this value
                max = newNums[i];
                

            }

            if (newNums[i] >secondMax && newNums[i]!=max) {

                secondMax=newNums[i];

            }

            
        }

        System.out.println("First max is  " + max);
        System.out.println("Second max is " + secondMax);

        System.out.println();

        // finding the minimum value :

        int minValue = newNums[2];

        for (int x = 0; x <newNums.length ; x++) {

            if (newNums[x] <minValue) {

                minValue=newNums[x];

            }

        }

        System.out.println("Minimum value is  " + minValue);
        
    }
}


