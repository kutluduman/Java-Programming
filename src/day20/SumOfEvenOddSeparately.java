package day20;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {

        int sumEven = 0 ;
        int sumOdd = 0 ;

        for (int x = 10 ; x <= 100 ; ++x) {

            if (x%2==0) {

                sumEven = sumEven + x;


            } else if (x%2 != 0) {

                sumOdd = sumOdd + x;

            }


        }

        System.out.println("Sum of Even is " +sumEven);
        System.out.println("Sum of Odd is " +sumOdd);



    }

}
