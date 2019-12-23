package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        int sum = 0 ;


        for (int x = 10 ; x <= 100 ; x++ ) {
            
            
            if (x%2 !=0) {


               sum+=x;         // add with sum of integer sum
                // or sum = sum + x
             
            }
         
            
        }

        System.out.println("sumOfOdd = " + sum);
           


        }

}
