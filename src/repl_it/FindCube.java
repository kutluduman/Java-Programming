package repl_it;

import java.util.Scanner;

public class FindCube {
    public static void cube() {
        //your code here

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("input: " + input);
        int output = input * input * input;
        System.out.println("output: " + output);


    }//end cube

    public static void main(String[] args) {

        cube();


    }
}
