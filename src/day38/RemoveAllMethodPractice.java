package day38;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        // I want to remove 100, 133 ;
        // just like addAll method, removeAll method expect another collection| list object to be removed


        nums1.removeAll(Arrays.asList(100, 133));

        System.out.println("nums1 after removed items = " + nums1);


    }
}
