package day05;

public class VariablePractice {

    public static void main(String[] args) {

       // 8 primitive
//         line 1
//         line 2
//         line 3
//          command slash


            /*
            Line 1
            Line 2
            Line 3
            Block comment, everything in between will be seen as comment
             */

        /*

        Whole numbers; byte, short, int, long
        Fractional numbers; float, doable
        logical; boolean (true or false), character(char)

      Usually by default for whole numbers: just use int
      Usually by default for fractional numbers: just use double


        Is String part of Primitive type?: No!

        String is sequence of character. Not primitive type.


         */

//        Task 1: age calculator
//        given birth year, please calculate the age

        int birthYear = 1995 ;

        int currentYear = 2019;

        int ageNow = currentYear - birthYear;

//      I was born in year 2001, and I am 18 years old;

        System.out.println("I was born in year " + birthYear + " and I am " + ageNow +
                " years old");

//    Task 2: You are speeding today
//    speed limit is some number, and your current speed is this
//    generate this output of : You are driving 10 mph more than speed limit

       int currentSpeed = 70 ;

       int speedLimit = 60 ;

       int overLimit =   currentSpeed - speedLimit ;

        System.out.println("You are driving " + overLimit + " mph more than speed limit which is "
                + speedLimit + " mph." );



    }


}
