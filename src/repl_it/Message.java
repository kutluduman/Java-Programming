package repl_it;

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender = message.substring(message.indexOf('<')+1, message.lastIndexOf('>'));
        String phoneNumber = message.substring(message.indexOf('[')+1, message.lastIndexOf(']'));
        String messageBody = message.substring(message.indexOf('{')+1, message.lastIndexOf('}'));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);





    }
}
