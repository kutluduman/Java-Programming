package day17;

public class OddEvenWithinRange {

    public static void main(String[] args) {

        int count = 0;

        while ( count<=50) {

            System.out.print(count + " ");
            count += 2 ;


        }
        System.out.println();
        System.out.println("------------------------------");

        int count2= 1;

        while (count2<=50) {

            System.out.print(count2 + " ");
            count2 += 2;


        }

        int count3 = 0 ;

        while (count3<=50) {

            if (count3 % 2 == 0) {

                System.out.println("is even number = " + count3);

            } else {

                System.out.println("is odd number = " + count3);

            }
            ++count3;

        }





    }
}
