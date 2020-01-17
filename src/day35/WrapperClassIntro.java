package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;
        // primitive data type are pure values that have no properties or behaviors(attributes)


        // each primitive type has wrapper class that turn it into object so we can treat it as objects with methods

        // this is the old not recommended way of creating Integer object
        Integer xObj1 = new Integer(12);

        /**
         * valueOf method if Integer class
         * return a integer object by wrapping up the value you passed
         * it has 2 overloaded version one that accept int, another accept String
         */

        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        /**
         * since x2 is pointing to Integer object
         * we can call all the methods of Integer class using this object
         */

        byte bValue = xObj2.byteValue();
        System.out.println("byte value = " + bValue);


    }
}
