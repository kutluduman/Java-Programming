package repl_it;

import java.util.Scanner;

public class ArraysPrinting03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];



        for (int i=0;i<6;i++) {

            arr[i] = input.nextLine();

        }

        System.out.println(arr[0]+ " , " +arr[1]+ " , " +arr[2]);
        System.out.println(arr[1]+ " , " +arr[2]+ " , " +arr[3]);
        System.out.println(arr[2]+ " , " +arr[3]+ " , " +arr[4]);
        System.out.println(arr[3]+ " , " +arr[4]+ " , " +arr[5]);





    }
}
