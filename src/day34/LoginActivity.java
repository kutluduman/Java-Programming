package day34;

public class LoginActivity {

    public static void main(String[] args) {

        loginVoid("user", "abc123");

        System.out.println();

        boolean result = loginReturn("user", "abc123");

        System.out.println(result);

        System.out.println();


        if (loginReturn("user", "abc123")) {

            System.out.println("Add Java Book to cart");
            System.out.println("Pay for Java Book in cart");
            System.out.println("View the order");

        } else {

            System.out.println("No shopping unless you signed in");

        }

    }

    public static void loginVoid(String userName, String password) {


        if (userName.equals("user") && password.equals("abc123")) {

            System.out.println("Login Successful");


        } else {

            System.out.println("login failed");
        }


    }

    public static boolean loginReturn(String userName, String password) {


        if (userName.equals("user") && password.equals("abc123")) {


            return true;


        } else {


            return false;

        }


    }


}
