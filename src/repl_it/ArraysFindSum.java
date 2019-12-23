package repl_it;

import java.util.Scanner;

public class ArraysFindSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum= 0;


        for (int x = 0; x <=nums.length-1 ; x++) {

            sum+=nums[x];


        }


        System.out.println(sum);



    }

}
