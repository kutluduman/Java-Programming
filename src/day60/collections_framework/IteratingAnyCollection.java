package day60.collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {


        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));

        Iterator<Integer> myIter = nums.iterator();


        // hasNext() ----> checks what you have next item

        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        // next()--> will move the pointer of iterator to the next element; 

        System.out.println("myIter.next() = " + myIter.next());

        System.out.println("myIter.next() = " + myIter.next());

        // remove()----> remove the item that is pointed

        myIter.remove();

        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        System.out.println("nums = " + nums);


    }
}
