package day22;

public class MultiplicationTableInAEasierWay {

    public static void main(String[] args) {

        // Generate Multiplication Table


//
//        for (int base = 1; base <= 12 ; base++) {
//
//            System.out.println("1 x 1 = " + 1 * 1 );
//
//            System.out.println("1 x " + base + " = " + 1 * base);
//
//
//
//        }
//
//        for (int base = 1; base <=12 ; base++) {
//
//            System.out.println("2 x " +base + " = " + 2 * base);
//
//
//        }
//
//        for (int base = 1; base <=12 ; base++) {
//
//            System.out.println("3 x " +base + " = " + 3 * base);
//
//
//        }


        for (int timesTable = 1; timesTable <=10 ; timesTable++) {


            System.out.println("Multiplication table of " + timesTable);

            for (int base = 1; base <=12 ; base++) {

            System.out.println(timesTable + " x " +base + " = " + timesTable * base);


        }



        }




    }

}
