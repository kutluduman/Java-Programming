package Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RecapArrayList6 {

    public static void main(String[] args) {

        /**
         * Review Session :
         *
         */


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // autoboxing, because we pass integer, but ArrayList accepts object, it converts to object.
        list.add(20);

        // add(index, object) ; it will insert the given object, at the given specific index number

        list.add(1, 30);

        System.out.println(list);

        list.add(3, 50);

        //       list.add(4,40); this will give error because it is out of boundary
        // arrayList size is dynamic. we cannot skip indexes

        // get(index number); returns the object at the given index

        System.out.println(list.get(3));

        System.out.println(list.get(1));

        // size(); returns the total number of elements in the list


        System.out.println(list.size());


        // finding last index number : list.size()-1


        // print all
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");


        }

        System.out.println();

        // reverse order

        for (int i = list.size() - 1; i >= 0; i--) {

            System.out.print(list.get(i) + " ");


        }

        System.out.println();

        // clear(); method clears all the objects from the array list

        list.clear();

        System.out.println(list);


        // set(0, object) ; replaces the object at the given index

        ArrayList<String> students = new ArrayList<>();

        students.add("Erhan");
        students.add("Humeyra");
        students.add("Rahwa");
        students.add("Arzu");
        students.add("Mehmet");


        System.out.println(students);


        students.set(0, "Holly");

        System.out.println(students);

        students.set(4, "Happy Birthday Mehmet");

        System.out.println(students);

        // indexOf(object) will returns the index number of given object

        System.out.println(students.indexOf("Rahwa"));

        students.set(2, "Gigi");

        System.out.println(students);

        //  lastIndexOf(Object); returns the last matching object's number

        System.out.println(students.lastIndexOf("Gigi"));

        ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A", "B", "C"));

        // equals(); checks whether two lists are equal

        System.out.println(students.equals(students2));

        //      students=students2; // we made both lists equal

        //      System.out.println(students.equals(students2)); // so true

        // contains(object); checks the given object contains in the list or not

        System.out.println(students.contains("Muhtar"));

        System.out.println(students.contains("Gigi"));

        System.out.println(students.contains("Holly"));

        // isEmpty() ; checks the size, if size is =0 then returns true

        System.out.println(students.isEmpty());

        ArrayList<Character> ch = new ArrayList<>();


        System.out.println(ch.isEmpty());

        ch.add('K');


        System.out.println(ch.isEmpty());

        // remove(primitive int)   remove method is overloaded method, it takes primitive int and objects
        // remove(object)          designed not to use within the loop


        ArrayList<Integer> price = new ArrayList<>();

        price.add(1);
        price.add(2);
        price.add(3);


        price.remove(0);

        System.out.println(price);

        price.add(0, 1);


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 2, 3, 1));

        for (int i = 0; i < nums.size(); i++) {


            if (nums.get(i) == 1) {

                nums.remove(nums.get(i));

                --i;

            }


        }

        System.out.println(nums);

        // removeAll(Collection) ; removes all the matching objects

        nums.removeAll(Arrays.asList(2));

        System.out.println(nums);


        // addAll(Collection) ; adds multiple objects to the ArrayList

        ArrayList<String> n1 = new ArrayList<>();

        n1.addAll(Arrays.asList("Kevin","Kobe","Richard"));

        System.out.println(n1);


        // sort() : Collections.sort(ArrayList) ; sorts the Array list in ascending order

        Integer[] arr = {1,2,3,4,5,5,5,100,-100, -9};

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list1);

        System.out.println(list1);





    }
}
