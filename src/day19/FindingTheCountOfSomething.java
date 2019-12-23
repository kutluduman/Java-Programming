package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {


        // print out from 1-100 all the numbers that can be divided by 15 without remainder
        // from 1-100 count how many numbers can be divided by 15
        
        int counter = 0; // I didn't count yet that's why 0

       for (int i = 1 ; i<=100 ; i++) {

           if (i%15==0) {

               System.out.println(i);
               ++counter ;

           }

        }

        System.out.println("counter = " + counter);

 
    }
}
