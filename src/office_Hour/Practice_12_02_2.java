package office_Hour;

import java.util.Scanner;

public class Practice_12_02_2 {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

                    //01234567890
 //    String name = "Zehra Aygun" ;
        String name = scan.nextLine();

// getting each character using charAt(index)
        // generate sequential number 0-----> 10

        // is there any chance while loop does not execute
        // in this case it does not bother to enter loop

//        int x = 100;
//
//        while (x<15){
//
//            System.out.println("WOLA");
//        }
//
//        System.out.println("The End");



        int x = 0;

        while (x < name.length()) {


   //         System.out.println("index : " + x); // this is the index
            System.out.print(name.charAt(x));

            ++x;


        }









    }

}
