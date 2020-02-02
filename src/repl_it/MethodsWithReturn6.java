package repl_it;

public class MethodsWithReturn6 {

    public double waterTax(double units) {
        double bill = 0.0;

        //your code here

        if (units <= 50) {

            bill = units * 0.60;

        } else if (units > 50) {

            bill = units * 0.90;

        } else if (units > 150) {
            bill = units * 0.9 + 100;

        } else if (units > 100) {

            bill = units * 0.9 + 50;

        }
        //end your code here


        return bill;
    }//end waterTax


}
