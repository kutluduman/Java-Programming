package repl_it;

public class ArrayList217 {

    public static boolean badP(int[] products, int limit) {

        int count = 0;

        for (int eachProduct : products) {

            if (eachProduct == 0) {

                count++;

            }

        }


        return count < limit;


    }

}
