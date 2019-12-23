package repl_it;

import java.util.Scanner;

public class Email1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();






        if (email.contains("_")) {

            int indexOf_ = email.indexOf("_");
            int indexOfAt = email.indexOf("@");
            String firstName = email.substring(0,indexOf_);
            String lastName = email.substring(indexOf_+1,indexOfAt);
            System.out.println(lastName+"_"+firstName+email.substring(indexOfAt));

        } else {


            System.out.println(email);

        }









    }
}
