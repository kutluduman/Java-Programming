package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        // Generate Multiplication Table


//        System.out.println("1 x 1 = " + 1 * 1 );              // see the pattern what is changing and what is not
//        System.out.println("1 x 1 = " + 1 * 2 );              // changing in the pattern
//        System.out.println("1 x 1 = " + 1 * 3 );


        for (int base = 1; base <= 12 ; base++) {

  //          System.out.println("1 x 1 = " + 1 * 1 );

            System.out.println("1 x " + base + " = " + 1 * base);



        }

        for (int base = 1; base <=12 ; base++) {

            System.out.println("2 x " +base + " = " + 2 * base);


        }

        for (int base = 1; base <=12 ; base++) {

            System.out.println("3 x " +base + " = " + 3 * base);


        }




    }

}
