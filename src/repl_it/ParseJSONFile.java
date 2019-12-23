package repl_it;

import java.util.Scanner;

public class ParseJSONFile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();


        int fIndex = json.indexOf("firstName");
        int fComma = json.indexOf(",",fIndex );
        int lIndex = json.indexOf("lastName");
        int lComma = json.indexOf(",",lIndex);






        System.out.println("First name: " +json.substring(fIndex+13,fComma-1));
        System.out.println("Last name: " +json.substring(lIndex+12,lComma-1));




    }
}
