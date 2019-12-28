package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

        /**
         *Create a class called OverloadingPractice
         * create 4 static void overloaded version of add method
         * 	1, add
         * 		has 1 int parameter and add 100 to that number
         * 		and print out the result
         * 	2, add
         * 		has 2 int parameters and add them to get sum
         * 		and print out the result
         * 	3, add
         * 		has 3 int parameters and add them to get sum
         * 		and print out the result
         * 	4, add
         * 		has 2 long parameters and add them to get sum
         * 		and print out the result

         */


        add(100);
        add(50, 50);
        add(100000l, 100000l);
        add(20, 30, 30);



    }

    public static void add(int num) {

        int sum = num + 100;
        System.out.println(sum);


    }

    public static void add(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println(sum);

    }

    public static void add(int num1, int num2, int num3) {

        int sum = num1 + num2 + num3;
        System.out.println(sum);


    }

    public static void add(long num1, long num2) {

        long sum = num1 + num2;

        System.out.println(sum);


    }


}
