package repl_it;

import java.util.Scanner;

public class ArraysFindingMaxLengthInStringArray {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();


        }

        String max = "";

        for (String eachString : words) {

            if (eachString.length()>max.length()) {

                max=eachString;


            }


        }

        System.out.println(max);



    }
}
