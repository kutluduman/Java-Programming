package day15;

public class Replace_Method {

    public static void main(String[] args) {

       String message = "I love Pumpkin, Pumpkin is fun ! " ;

       message.replace("Pumpkin", "Java ! ");

        System.out.println(message.replace("Pumpkin", "Java"));

        // its case sensitive so you have to be careful when your are typing the word


        String message2 = "Happy Thanks Giving to All!! "; // how can I remove the space between thanks and giving

        // what if I want to replace space from everywhere
    
        message2 = message2.replace("Thanks Giving", "ThanksGiving");
        System.out.println("message2 = " + message2);

        message2= message2.replace("!!", "!");
        System.out.println("message2 = " + message2);


        message2= message2.replace(" ", "");
        System.out.println("message2 = " + message2);



        String message3 = "TOMORROW IS OFF NO!";
        message3 = message3.replace("OFF", "");
        message3 = message3.replace("NO!", "");


        System.out.println(message3);






    }

}
