package day31;

public class Calculator {

    public static void main(String[] args) {

    add(5,2);
    add3Numbers(10,12,30);


    }


    public static void add(int num1, int num2) {

        System.out.println("addition result: " + (num1+num2));

    }


    public static void add3Numbers(int num1, int num2, int num3) {

        System.out.println("addition result of 3 numbers is " + (num1+num2+num3));

    }


}
