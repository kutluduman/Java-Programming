package repl_it;

import java.util.Scanner;

public class MethodsSplitPersonInfo {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {

        //your code here

        String[] infoSplit = info.split(",");

        System.out.println("person name: " + infoSplit[0] + " last name: "
                + infoSplit[1] + " age: " + infoSplit[2]);


    }//end person
}
