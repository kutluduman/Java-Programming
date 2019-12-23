package day21;

public class NestedLoopTask {

    public static void main(String[] args) {

            /*
            * // count from 1 to 10 --> print only odd numbers
            *
             // repeat this 4 times
            * */


        for (int i = 1; i <=10 ; i++) {

            if (i % 2 ==0) {

                continue;




            }
            System.out.println(i);


        }
        System.out.println();

        for (int x = 1; x < 4 ; x++) {

            for (int i = 1; i <=10 ; i++) {

                if (i % 2 ==0) {

                    continue;




                }
                System.out.println(i);


            }
            System.out.println();




        }






    }
}
