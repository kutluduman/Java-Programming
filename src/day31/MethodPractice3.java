package day31;

import java.util.Scanner;

public class MethodPractice3 {

    public static void main(String[] args) {

        // write piece of reusable code to count from 1 to 10
        // give a name count1to10
        // no need for object when being called    : static
        // it should be accessible anywhere in your project   : public
        // it does not return any value : void

        count1to10();
//        System.out.println();

        MethodPractice3.count1to10();

        System.out.println();







    }


    public static void count1to10(){

        for (int i = 1; i <=10 ; i++) {

            System.out.print(i + " ");

        }

        System.out.println();




    }


}
