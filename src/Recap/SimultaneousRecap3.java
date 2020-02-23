package Recap;


import java.util.Arrays;

public class SimultaneousRecap3 {

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c'};

        int z = chars.length;
        int count = 0;

        while (count < z - 1) {

            count++;    // Answer is 2

        }
        System.out.println(count);

        System.out.println("---------------");

        String[] arr = {"Maral", "Nurullah"};

        arr[0] = arr[1]; // nurullah nurullah
        arr[1] = arr[0]; // nurullah nurullah

        System.out.println(Arrays.toString(arr));

        System.out.println("---------------");

        int nums[] = {5, 4, 3, 2, 1};

        for (int each : nums) {

            if (each == 3) {

                continue;

            }

            System.out.println(each + " "); //5,4,2,1
            break; // this exits the loops after the first print

        }

        System.out.println("---------------");

        char[] characters = {'a', 'b', 'c'};

        for (char each : characters) {

            System.out.print(each + " ");
            if (each == 'b')                // because the statement is already printed
                continue;
        }


        System.out.println("---------------");

    }
}
