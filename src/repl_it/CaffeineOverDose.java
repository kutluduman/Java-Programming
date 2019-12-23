package repl_it;


import java.util.Scanner;

public class CaffeineOverDose {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int coffeeCaffeine = scan.nextInt();
        int convertGrMilligrams = (10 * 1000) /coffeeCaffeine ;

        System.out.println("It would take about " + convertGrMilligrams + " drinks for a lethal overdose.");







    }

}
