package Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapArrayList4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3));
        // 0,1,2


        int a = 1;

        list.remove(a); // index number 1 is object 2, it will remove 2

        System.out.println("list = " + list);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3));

        Integer a1 = 1;

        list2.remove(a1);

        System.out.println("list2 = " + list2);


    }
}
