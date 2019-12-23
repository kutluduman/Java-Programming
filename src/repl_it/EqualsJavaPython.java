package repl_it;

import java.util.Scanner;

public class EqualsJavaPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava = 0;
        int countPython = 0 ;

        for (int x = 0; x <= sentence.length() ; x++) {


            if (sentence.substring(x).startsWith("java")) {

                countJava++;



            }

            else if (sentence.substring(x).startsWith("python")) {


                countPython++;


            }





        }

        System.out.println(countJava==countPython);


    }
}
