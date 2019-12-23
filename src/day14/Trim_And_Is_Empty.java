package day14;

public class Trim_And_Is_Empty {

    public static void main(String[] args) {


        String message = "  REPL IS COMING  !  " ;


        System.out.println(message);
        System.out.println("message character count is " + message.length());

        System.out.println(message.trim());

        System.out.println("message character count is " + message.length()); //string is immutable that's why it does
                                                                                // not change


        message = message.trim(); // we assigned the value, that's why now it gives the correct count

        System.out.println("message character count is " + message.length());

        // trim method is used to trim the spaces on two sides not in between


        System.out.println(message.isEmpty());




    }


}
