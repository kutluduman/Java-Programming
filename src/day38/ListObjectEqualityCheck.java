package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class ListObjectEqualityCheck {


    public static void main(String[] args) {


        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(200,300,600,700,800));

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));

        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(300,200,700,600,800));

        System.out.println("nums1.equals(nums2) = " + nums1.equals(nums2));


        // order of the elements matter when you check the equality
        System.out.println("nums2.equals(nums3) = " + nums2.equals(nums3));














    }
}
