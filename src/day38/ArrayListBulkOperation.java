package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {


        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");

        System.out.println("groceries = " + groceries);

        ArrayList<String> newList = new ArrayList<>(groceries);

        newList.add("diet coke");
        newList.add("sugar");

        System.out.println("newList = " + newList);

        // actually I have list of items for you here : Pasta, branzini, asparagus, spinach
        // good news is I already created a List object for you so you can just add them all to your existing list


        List<String> newItemsToAdd = Arrays.asList("Pasta", "branzini", "asparagus", "spinach");

        // Adding one list to another list
        // We want to add all items inside newItemsToAdd to newList

        newList.addAll(newItemsToAdd);

        System.out.println("newList after everything is added = " + newList);


        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);


        nums1.addAll(nums2);

        System.out.println("nums1 after added = " + nums1);
        
        // add 4 items to num2 using add all 100,200,300,400
        
        nums2.addAll(Arrays.asList(100,200,300,400));

        System.out.println("nums2 = " + nums2);


        // Arrays.asList method will return a List Object that contains items it specified
        
    }

}
