package repl_it;

import java.util.Scanner;

public class PrefixAgain {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        String prefix = str.substring(0,n);

        System.out.println(str.substring(n).contains(prefix));

    }
}
