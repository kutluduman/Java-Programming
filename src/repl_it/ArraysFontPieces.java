package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysFontPieces {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];


        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();

        }

        if (size>=2) {

            System.out.println("["+num[0]+", "+num[1]+"]");


        } else {

            System.out.println(Arrays.toString(num));

        }


    }
}
