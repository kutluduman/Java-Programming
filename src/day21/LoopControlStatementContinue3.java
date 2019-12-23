package day21;

public class LoopControlStatementContinue3 {

    public static void main(String[] args) {

        // count 1 to 100
        // skipp all the numbers that are divisible by 5


        for (int i = 1; i <=100 ; i++) {

            if (i % 5 != 0) {
                System.out.println(i);


            } else {

                System.out.println("Skipping " + i);


            }

        }



    }


}
