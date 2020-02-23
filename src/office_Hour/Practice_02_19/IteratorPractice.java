package office_Hour.Practice_02_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {

    public static void main(String[] args) {


        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));


        Iterator<Integer> listIterator = lst.iterator();

        // to check if we have element at next position
        System.out.println("listIterator.hasNext() = " + listIterator.hasNext());

        // will move the pointer to the next element and get the value
        System.out.println("listIterator.next() = " + listIterator.next());

        // Now time to iterate over using the iterator
        // First thing first we need to decide when we keep looping?
        // as long as we have the next element
        // How to move to the next and get the value numIterator.hasNex()

        while (listIterator.hasNext()) {

            int x = listIterator.next();

            if (x > 10) {


                System.out.println("listIterator.next() = " + x);


            }
        }


    }
}
