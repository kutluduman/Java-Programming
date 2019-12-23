package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {


        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2= {22,45,6,37,3,6,9};
        int[] scores3= {2,5,6,7,3,34,6};
        int[] scores4= {6,5,6,7,3,2,34};


        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);

        System.out.println();

        boolean score1EqualScore2 = Arrays.equals(scores1,scores2);
        boolean score1EqualScore3 = Arrays.equals(scores1,scores3);

        System.out.println(score1EqualScore2);
        System.out.println(score1EqualScore3);

        System.out.println();

        boolean score3EqualScore4 = Arrays.equals(scores3,scores4);
        System.out.println(score3EqualScore4); // this will be false because order is important
//      you could sort and check it again. After sorting, boolean will be true


    }
}
