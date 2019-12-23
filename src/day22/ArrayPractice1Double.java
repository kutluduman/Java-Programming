package day22;

public class ArrayPractice1Double {

    public static void main(String[] args) {


        double[] prices = new double[5];

        System.out.println(prices[0]);  // for double you get default 0.0


        System.out.println(prices); // you can not print out array variable directly
                                    // to see what's inside

        prices[0]= 2.46 ;
        prices[1]= 12.96 ;
        prices[2]= 992.1 ;
        prices[3]= 500 ;
        prices[4]= 65.123 ;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // what happens if you over range ; it gives error


        // run time and compiler error
    }

}
