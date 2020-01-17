package office_Hour;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_12_30 {

    public static void main(String[] args) {


        byte a = 10;

//    Integer A = a ;  you cannot assign to integer, because a is dedicated to byte


        float f = 0.5f;

        Float d = f; // you can assign here because it is dedicated to same primitive class.

//        Double s = f;  compile error because it is dedicated to its specific primitive.

        /**
         * Each wrapper classes are dedicated to their own primitives
         * All those wrapper classes are represented in "java.lan" package
         * imported automatically
         */


        Double num1 = 0.5;
        Short num3 = 45;
        double num2 = num1;
        double num4 = num3; // you can assign wrapper class to primitives. Primitives accept wrapper class

        Long numberOne = 100l; // Autoboxing, assigning primitive value to wrapper class
        Long numberTwo = (long) 100; // Autoboxing, assigning primitive value to wrapper class

        Float f1 = 100.0f;

        double d1 = f1; // unboxing, assigning wrapper class to primitive

        System.out.println(Byte.MAX_VALUE); // max value of Byte

        System.out.println(Byte.MIN_VALUE); // minimum value of Byte

        // parse method:

        String str1 = "123";

        System.out.println(str1 + 1); // 1231 ----> concatenating


        int result1 = Integer.parseInt(str1);

        System.out.println(result1 + 1); // 124 ----> because we converted String to int

        String str2 = "true";

        boolean conversion = Boolean.parseBoolean(str2);

        System.out.println(conversion);

        String str3 = "fAlSe";

        boolean conversion2 = Boolean.parseBoolean(str3);

        System.out.println("conversion2 = " + conversion2);

        String str4 = "Parvin";

        boolean r3 = Boolean.parseBoolean(str4);

        System.out.println("r3 = " + r3); // it is not true, that is why it gives false outcome

        // ValueOf :

        String s1 = "100.5";

        Double c1 = Double.parseDouble(s1); // auto boxing
        System.out.println(c1 + 1);

        Double c2 = Double.valueOf(s1); // wrapper

        System.out.println(c2 + 1);

        String s2 = "fAlSe";

        Boolean d2 = Boolean.valueOf(s2);
        System.out.println(d2); // wrapper class

        int[] arr = new int[3];

        System.out.println(Arrays.toString(arr)); // will get zero as default for arrays

        Double[] arr1 = new Double[3];
        System.out.println(Arrays.toString(arr1)); // will give null as wrapper classes default is null

        System.out.println(addNum(105.5, 105.5));


    }

    public static int addNum(int num1, int num2) {

        int result = num1 + num2;

        return num1 + num2;
    }

    public static double addNum(double a, double b) {


        return a + b;
    }

}
