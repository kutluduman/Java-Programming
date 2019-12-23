package day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});

        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);

        printMaxOfIntArray(new int[]{2, 4, 7, 9});
        printMinOfIntArray(new int[]{1, 3, 5, 6});
        printSumOfIntArray(new int[]{10, 10, 10});
        checkScoresAllMoreThan60(new int[]{4, 5, 12, 67, 45, 32});
        compare2arraySize(new String[]{"Sezgin","Senay","Astrit"} , new String[]{"Araz"});


    }


    public static void printArrayItems(int[] nums) {

        System.out.println("arrays has items : " + Arrays.toString(nums));


    }

    public static void printMaxOfIntArray(int[] nums) {

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {

                max = nums[i];

            }

        }

        System.out.println(max);

    }

    public static void printMinOfIntArray(int[] nums) {

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (min > nums[i]) {

                min = nums[i];

            }

        }

        System.out.println(min);

    }

    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

        }
        System.out.println(sum);

    }

    public static void checkScoresAllMoreThan60(int[] nums) {


        for (int each : nums) {

            if (each > 60) {

                System.out.println("Passed");
            } else {

                System.out.println("Failed");
            }

        }

    }

    public static void compare2arraySize(String[] arr1, String[] arr2) {


        if (arr1.length > arr2.length) {

            System.out.println("Array 1 has more item");


        } else if (arr2.length > arr1.length) {

            System.out.println("Array 2 has more item");

        } else {

            System.out.println("They have same item count");

        }


    }


}
