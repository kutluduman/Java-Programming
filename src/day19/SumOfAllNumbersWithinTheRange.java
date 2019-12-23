package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        // get the sum of numbers from 1 - 10
        // it's interesting 1+2+3+4+5+6+7+8+9+10 how much is it

        // when we loop from 1 to 10

        int sum = 0 ; // before we add any number the sum is 0


        for (int i = 1 ; i<=10 ; i++ ) {

            sum = sum + i;
            System.out.println(sum);




        }

        System.out.println(sum);


    }

}
