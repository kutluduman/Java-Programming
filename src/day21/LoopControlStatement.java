package day21;

public class LoopControlStatement {

    public static void main(String[] args) {

        // break
            //if line contains break reaches, the loop will stop

        // continue
          //if Line contains break reaches, the loop will skip to next iteration


        // We can use Break and Continue for any type of loop


        for (int i = 1; i <= 10 ; i++) {

            System.out.println(i);
            break;

        }


        // while iterating over 1 to 10
        // break of the loop when it's 5


        for (int i = 1; i <= 10 ; i++) {

            System.out.println(i);

            if (i==5) {
                                            // gives break at 5, does not go to 10

                break;

            }

        }


        int sum = 0 ;


        for (int i = 1; i <= 10 ; i++) {

            System.out.println("current sum is " + i);


            if (sum + i > 40) {

                break;


            }

                sum+=i;

        }

        System.out.println("sum = " + sum);



    }
}
