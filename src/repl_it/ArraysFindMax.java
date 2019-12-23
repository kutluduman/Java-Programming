package repl_it;

import java.util.Scanner;

public class ArraysFindMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};



        int maxNum = nums[0];


        for (int each   : nums ) {

          if (each>maxNum) {

              maxNum=each;

          }


        }

        System.out.println("maxNum = " + maxNum);

    }

}
