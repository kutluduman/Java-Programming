package day14;

public class Review {
    public static void main(String[] args) {



        String str = "I like Pumpkin" ;

        // System.out.println( str.equals("pumpkin")  );


        // contains :
        // it checks whether a string exist in another string
        // it needs external data
        // you get true or false result (boolean)

        System.out.println("Does it contain Pumpkin : ");
        System.out.println(str.contains("Pumpkin")         );

        boolean gotPumpkin = str.contains("Pumokin"); // we save the result

        // shortcut to print variable value in nice format ---> soutv + tab

        //      System.out.println("gotWord = " + gotWord);

        // startsWith endsWith :
        // check whether a string starts with another string
        // check whether a string ends with another string
        // you get true or false result (boolean)

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("ends With Pumpkin = " + endWithPumpkin);






    }
}
