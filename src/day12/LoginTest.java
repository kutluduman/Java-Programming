package day12;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {


        /*

        String str = "abc" ;
        str.equals("abc") —> true       ! str.equals("abc") —>> false
        Create class called LoginTest with main method
         Create 2 String variable called userName , password
         and do following
        // your correct username password is  user123  and pass123
         Check if your username and password correct
        If so print login successful
        If not
                Check whether your username correct
	        if not print  , username is not correct
            Check your password is correct or not
                 If not print password is not correct


         */






        Scanner scan = new Scanner(System.in);

        System.out.println("What's your username ? ");

        String userName = scan.next();

        System.out.println("Whats your password ? ");

        String password =  scan.next();

        if (userName.equals("user123")  && password.equals("pass123")) {

            System.out.println("Successful login");


        } else if (!userName.equals("user123") ) {  // equal

            System.out.println("Username is not correct");

        } else if (!password.equals("pass123") ) {      // ! not equal

            System.out.println("Password is incorrect");
        }







    }




}
