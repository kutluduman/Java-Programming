package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {

    public static void main(String[] args) {

        System.out.println(getListFrom1toFinalNumber(7));
        System.out.println(getListFrom1toFinalNumber(2));
        System.out.println(getListFrom1toFinalNumber(20));


    }

    // Create a method that accepts a finalNumber as int
    // return an ArrayList of Integer containing Numbers
    // starting from 1 till finalNumber

    public static List<Integer> getListFrom1toFinalNumber(int finalNumber) {

        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {

            nums.add(numbers);

        }

        return nums;


    }


}
