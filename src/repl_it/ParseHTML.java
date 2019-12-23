package repl_it;

import java.util.Scanner;

public class ParseHTML {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        int first = html.indexOf("id");
        int last = html.lastIndexOf("\"");

        if (html.contains("html")) {

            System.out.println(html.substring(first+4,last)) ;




        }   else  {


            System.out.println("Invalid input!");
        }







    }
}
