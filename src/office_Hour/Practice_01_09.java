package office_Hour;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice_01_09 {

    public static void main(String[] args) {

        /**
         * ArrayList Methods : add, get, clear, set, contains, equals, remove, indexOf, remove, addAll, size, isEmpty,
         * RemoveAll, sort
         *
         *  ArrayList class :     1) presented in java.util package
         *                        2) only supports non-primitives
         *                        3) it's size is automatically adjusted(Dynamic), array size is fixed.
         *                        4) does have index number same as arrays
         *
         *  ArrayList Vs Arrays :  1) ArrayList supports only non primitives, arrays support both
         *                          2) ArrayList size is dynamic, Arrays size is fixed
         *
         *   declaration : ArrayList<ObjectType> list = new ArrayList<>();
         *                  List<ObjectType> list = new ArrayList<>();
         *
         *
         *   add(Object): adds the given object to the list
         *
         *  add(index number, object) : inserts the given object to the specific index
         *
         *   size() : returns the total number of objects
         *
         *  get(int index) : gets the object from the given index, returns object
         *
         *  clear(): removes all the objects from the list, size of the list will be zero
         *
         *  set(int index number, object) : given object will be replacing to the given index
         *
         *  contains(Object) : check whether given object exist in the list or not in boolean return
         *
         *  equals(List) : checks if the two lists have same object or not
         *
         *  isEmpty(Object) : checks if the size of the ArrayList size is zero, boolean return
         *
         *  indexOf(Object): returns the index number of the given object, returns primitive int, if it doesn't exist -1
         *
         *  remove( int index) : removes the given index
         *
         *  remove(Object) : removes the first matching given object, returns boolean value
         *
         *  Converting Array to List : ONLY NON PRIMITIVE ARRAY CAN BE CONVERTED TO ARRAY LIST
         *                                  Arrays.asList(data collection); data collection returns as list
         *
         * removeAll(CollectionType) : removes entire matching objects from the list
         *
         * addAll(CollectionType) : adds entire matching objects type to the list
         *
         *  String[] arr = {"A","B"};
         *          List<String> list1 = new ArrayList<>(Array.asList(arr));
         *
         *   retainAll(collectionType) : removes all the non matching objects from the list
         *
         *   sort arrays : Arrays.sort(ArrayName);
         *
         *   sorting List : Collections.sort(CollectionTypeName);
         *
         *   Collection class is presented in Java.Util package
         */


        List<Integer> list = new ArrayList<>();

        list.add(10); // this primitive is converted to wrapper class and becomes object (autoboxing)

        System.out.println(list.size());

        list.add(100);

        System.out.println(list.size());

        int num = list.get(1); // unboxing

        System.out.println("num = " + num);

        list.add(1, 30);


        System.out.println(list.get(1));

        list.clear();

        System.out.println(list.size());


        List<String> list2 = new ArrayList<>();

        list2.add("A");

        list2.set(0, "K");

        System.out.println(list2.get(0));


        boolean result = list2.contains("B");

        System.out.println("result = " + result);

        boolean result2 = list2.equals(list);

        System.out.println("result2 = " + result2);

        boolean result3 = list2.isEmpty();

        System.out.println("result3 = " + result3);

        int result4 = list2.indexOf("K");

        System.out.println("result4 = " + result4);


        List<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        int a1 = 1; // this removes index 1, so its 2

        list3.remove(a1);

        System.out.println(list3);

        Integer a2 = 1;

        list3.remove(a2); // this removes object 1

        System.out.println(list3);


        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        List<Integer> arr1 = Arrays.asList(arr);

        List<String> names = new ArrayList<>();

        String[] students = {"Nursultan", "Irina", "Roksana", "Dilshat"};

        Arrays.asList(students);

        names.addAll(Arrays.asList(students));

        names.addAll(Arrays.asList("Mohammed", "Bulent"));

        System.out.println(names);


        List<String> classes = new ArrayList<>();

        classes.addAll(Arrays.asList("A", "B", "C", "D", "E", "F"));

        System.out.println(classes);

        classes.removeAll(Arrays.asList("A", "C"));

        System.out.println(classes);


        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("Mercedes", "Bmw", "Corolla", "Range Rover", "Jaguar", "Honda"));

        // remove all the cars that are not Bmw, mercedes, jaguar, range rover

        cars.retainAll(Arrays.asList("Range Rover", "Jaguar", "Bmw", "Mercedes"));

        System.out.println(cars); // all the non matching objects are removed


        /**
         *  Interview Question :
         *          give name list : Ahmet, John, Ahmet, Eric, Aoron
         *  remove all the object names "Ahmet"
         */

        List<String> employees = new ArrayList<>(Arrays.asList("Ahmet", "John", "Ahmet", "Eric", "Aoron"));

        System.out.println("employees = " + employees);

        employees.removeAll(Arrays.asList("Ahmet"));

        System.out.println("employees = " + employees);

        List<String> employees2 = new ArrayList<>(Arrays.asList("Ahmet", "John", "Ahmet", "Eric", "Aoron"));

        employees2.retainAll(Arrays.asList("Ahmet"));
        System.out.println("employees2 = " + employees2); // keeps only Ahmet

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));


        Collections.sort(nums2);

        System.out.println("nums2 = " + nums2);


    }

}
