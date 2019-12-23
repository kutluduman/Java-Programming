package repl_it;

public class UtopianTree {

    public static void main(String[] args) {

        int cm = 0 ;


        for (int i = 1 ; i<11 ; i++) {

            if (i<=3) {

                cm+=1;
                System.out.println("year " + i + " - growth 1cm");

            } else {


                cm+=2;
                System.out.println("year " + i + " - growth 2cm");
            }

            System.out.println("tree size: " + cm + "cm");


        }


    }

}
