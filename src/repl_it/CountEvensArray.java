package repl_it;

import java.util.Scanner;

public class CountEvensArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        
        int countEven = 0 ;

        for (int eachNums : nums) {

            System.out.println(eachNums);
            
            if (eachNums%2==0) {
                countEven++;
                
                
            }


        }

        System.out.println("countEven = " + countEven);






    }
}
