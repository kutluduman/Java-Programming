package Recap;


import java.util.ArrayList;
import java.util.Arrays;

public class RecapArrayList {

    public static void main(String[] args) {

        /**
         * Write a return method that can remove the duplicated objects from an Integer ArrayList
         *
         */


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));

        System.out.println("list = " + list);


        System.out.println(removeDup(list));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 4, 4, 5, 5, 5, 6, 6, 6));

        System.out.println("list2 = " + list2);

        list2 = removeDupWithRegularLoopTRIAL(list2);

        System.out.println("list2 = " + list2);


    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();
        // first I create a new ArrayList where I will be adding my non duplicate
        // by using for each loop, I assign the values given in the parameter (list) to each
        // by using if condition, if result does not contain each, then we add result.add=each;
        // return result


        for (Integer each : list) {

            if (!result.contains(each)) {

                result.add(each);

            }


        }

        return result;


    }

    public static ArrayList<Integer> removeDupWithRegularLoop(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (!result.contains(list.get(i))) {

                result.add(list.get(i));

            }


        }

        return result;

    }

    public static ArrayList<Integer> removeDupWithRegularLoopTRIAL(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            if (!result.contains(list.get(i))) {

                result.add(list.get(i));

            }


        }

        return result;

    }


}
