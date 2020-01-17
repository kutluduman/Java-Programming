package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Long> list = new ArrayList<>();

        list.add(12L);
        list.add(100L);
        list.add(150L);
        list.add(200L);

        System.out.println(list);

        // I want to insert 125 between 100l and 150l

        list.add(2, 125l);

        System.out.println(list);


        System.out.println(list);

        // updating value at certain index :

        list.set(3, 195l);

        System.out.println(list);

        // removing value at certain index :

        list.remove(1);

        list.remove(100L);

        System.out.println(list);

        // looking for location of certain item :

        System.out.println("Location of 125 is " + list.indexOf(125l));

        // Check whether a list is empty or not

        System.out.println(list.isEmpty());

        // delete everything in the list :

        list.clear();

        System.out.println(list.isEmpty());

        // check whether we have certain item or not

        System.out.println(list.contains(100l));


        // how do I check whether a list contains an item without using contains method
        // use indexOf method , if it return -1 , it means we don't have it

        System.out.println("DO I HAVE 10L = " + (list.indexOf(10L) != -1));


    }

}
