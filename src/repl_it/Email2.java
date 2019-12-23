package repl_it;

import java.util.Scanner;

public class Email2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();


//        String firstName = email.substring(0, 1).toUpperCase()+email.substring(1,email.indexOf("_"));
//        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("_"+2))
//                .toUpperCase()
//                .substring(email.indexOf("_"+2, email.lastIndexOf("@")));
//        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
//        String topLevelDomain = email.substring(email.indexOf('.')+1);
//
//        System.out.println("First name: " + firstName);
//        System.out.println("Last name: " + lastName);
//        System.out.println("Domain: " + domain);
//        System.out.println("Top-Level Domain: " + topLevelDomain);



        System.out.println("First name: "+email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")));
        System.out.println("Last name: "+email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
        System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
        System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1));




    }
}
