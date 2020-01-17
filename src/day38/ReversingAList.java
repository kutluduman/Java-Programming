package day38;

import java.util.*;

public class ReversingAList {

    public static void main(String[] args) {


        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200,100,700,400,500)) ;

        System.out.println("nums1 = " + nums1);

        Collections.reverse(nums1);

        System.out.println("nums1 reverse without sort = " + nums1);


        Collections.sort(nums1, Comparator.reverseOrder());

        System.out.println("nums1 after reverse after sort = " + nums1);





    }
}
