package day36;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodPractice2 {

    public static void main(String[] args) {

        long[] myLongs = {11l, 22l, 33l, 44l};
        System.out.println(Arrays.toString(myLongs));

        swampFirstAndLastValue(myLongs);
        System.out.println(Arrays.toString(myLongs));


        long[] myNums1 = new long[5];
        System.out.println("myNums1 = " + Arrays.toString(myNums1));

        String[] names = new String[5];
        System.out.println("names = " + Arrays.toString(names));

        Long[] myNums2 = new Long[5];
        System.out.println("myNums2 = " + Arrays.toString(myNums2));

//        String str = "abc" ;
//        String str2 = null ;

        int x = 0;
        Integer x1 = null;

        // ONE THING THAT PRIMITIVE VARIABLES CAN NOT DO IS :
        // WE CAN NOT ASSIGN IT TO NULL
        // ANY NON-PRIMITIVE VARIABLES (REFERENCE VARIABLES )
        // CAN ASSIGNED TO NULL VALUE
        // TO DEFINE , IT'S NOT POINTING TO ANY OBJECT YET

    }

    public static void swampFirstAndLastValue(long[] nums) {

        long temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;


    }

}
