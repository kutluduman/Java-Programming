package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemovePractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(14);
        list.add(34);
        list.add(41);
        list.add(19);

        System.out.println(list);

        list.remove(3);

        System.out.println("After removal of index 3" + list);

        // I want to remove by object rather than index

//        list.remove(new Integer(2)); or

        list.remove(Integer.valueOf(2));

        System.out.println(list);



    }
}
