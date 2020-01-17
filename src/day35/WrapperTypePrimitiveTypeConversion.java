package day35;

public class WrapperTypePrimitiveTypeConversion {

    public static void main(String[] args) {

        Integer num1 = 100; // ----> auto-boxing 100 -----> new Integer(100)


        /**
         * Integer.valueOf is a method that return Integer object
         * it has 2 overloaded version one that accept number, another accept String
         * But both of them return integer object
         */


        int num2 = Integer.valueOf("200"); // auto boxing into 200

        /**
         * This can not happen by itself
         * int num3="200";
         *  This is how we can use parseInt to convert String to int
         */

        int num3 = Integer.parseInt("200");


        /**
         * Integer.parseInt("numberHere")
         * it return an int value converted from String
         *
         * Integer.valueOf(numberHere)
         * it return an Integer object by wrapping up the number
         *
         * You may use whichever you want because :
         * Auto-boxing and Auto-unboxing will take care of the conversion anyway
         */


        /**
         * Use this number and store the year into a int variable
         * This case number always start with 3 character
         * Followed by year, followed by dash and 5 digit number
         */


        String caseNumber = "IPR2012-00001";
        int year; // -- get 2012 out of it

        System.out.println(getYearOutOfCaseNumber("IPR2012-00001"));

    }

    public static int getYearOutOfCaseNumber(String caseNumber) {

        int num = Integer.valueOf("IPR2012-00001".substring(3, 7));

        return num;


    }
}
