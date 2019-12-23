package repl_it;

import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");

        int inputSeconds = scan.nextInt();

        int hours = inputSeconds / 3600;
        int remainder = inputSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;

        System.out.println(hours+ " hours, " + minutes + " minutes, and " + seconds + " seconds");


    }

}
