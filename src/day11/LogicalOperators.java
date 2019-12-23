package day11;

public class LogicalOperators {

    public static void main(String[] args) {


        System.out.println("TRUTH TABLE");

        System.out.println( "Result of true && true is " + (true && true)  );

        System.out.println( "Result of false && true is " + (false && true)  );

        System.out.println( "Result of true && false is " + (true && false)  );

        System.out.println( "Result of false && false is " + (false && false)  );

        /*
       Without concatenation

         */



        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);


        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);



        // create a variable called num with type int
        // find out whether this number is more than 100 or less than 10
        // find out the number is within the range of 10-60

        int num = 15 ;


        System.out.println(num > 100 || num < 10);
        System.out.println(num > 100 && num < 10);
        System.out.println(num >=10 && num<= 60);



        int x = 55 ;

        System.out.println( x>100 || x <10);
        System.out.println( x >10 && x<60);


        System.out.println( true || false || false);
        System.out.println( true && true & false );

        //                      false  false   true  // as one of them is true || this makes whole true
        System.out.println(   x==50 || x==51 || x==55       );


        // check x is more than 50 and x is not 52 or x equal to 57

        System.out.println( x > 50 && x != 52 || x== 57);


        System.out.println(false || true && true);


        System.out.println( 7> 5 && 1>7);
        System.out.println(5> 5 && 1>7);
        System.out.println(1> 5 && 9>7);

        System.out.println( 7> 5 & 1>7);
        System.out.println(5> 5 & 1>7);
        System.out.println(1> 5 & 9>7);


   //     System.out.println( 9/ 0); ERROR. Can not divide by zero

        // I want to check whether dividing 9 by 0 is 3

  //      System.out.println( 9/0 == 3);


        System.out.println( 5>10 && 9/0 == 3  );



    }


}
