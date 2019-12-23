package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        for (int i = 0, j=nums.length-1 ; i<nums.length/2 ; i++, j--) {

            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            
        }






        System.out.println(Arrays.toString(nums));

    }
}
