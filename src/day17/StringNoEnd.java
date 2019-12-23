package day17;

import java.util.Scanner;

public class StringNoEnd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();

        String txtNewVersion = txt.substring(0,txt.length()-1);

        System.out.println(txtNewVersion);






    }
}
