package repl_it;

import java.util.Scanner;

public class MethodsSimpleCalculator {

    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here

        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int result = firstNumber+secondNumber;

        System.out.println("result: " +result);




    }
}
