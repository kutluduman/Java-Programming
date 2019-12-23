package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHas55 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        boolean output = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 5 && nums[i + 1] == 5) {

                output = true;


            }

        }

        System.out.println(output);

    }
}
