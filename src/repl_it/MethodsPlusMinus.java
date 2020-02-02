package repl_it;

import java.util.Scanner;

public class MethodsPlusMinus {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    public static void plus_minus(int[] nums) {

        int positive = 0;
        int negative = 0;
        int zero = 0;


        for (int each : nums) {

            if (each > 0) {

                positive++;


            } else if (each < 0) {

                negative++;


            } else if (each == 0) {

                zero++;

            }


        }

        System.out.println("positives:" + positive+ ", negatives:" + negative+", zeros:" +zero );


    }


}

