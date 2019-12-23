package day21;

public class LoopControlStatementContinue2 {

    public static void main(String[] args) {

        // count 1 to 100
        // skipp all the numbers that are divisible by 5


        for (int i = 1; i <=100 ; i++) {

        if ( i % 5 ==0 ) {
            System.out.println("Skipping " + i);
            continue;


        }

            System.out.println(i);



        }










    }


}
