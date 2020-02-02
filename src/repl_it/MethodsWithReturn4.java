package repl_it;

public class MethodsWithReturn4 {

    public String c_profits(int buyPrice, int sellPrice) {

        String outcome = "";


        if (sellPrice > buyPrice) {

            outcome = "profit";

        } else if (buyPrice > sellPrice) {

            outcome = "loss";


        } else if (buyPrice == sellPrice) {

            outcome = "no loss";


        }

        return outcome;

    }


}
