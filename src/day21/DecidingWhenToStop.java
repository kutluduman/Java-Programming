package day21;

public class DecidingWhenToStop {

    public static void main(String[] args) {

      String msg = "Hello World" ;

      int charCount = msg.length();

            // 1 character:

        for (int i = 0; i <=charCount-1 ; i++) {

            System.out.println(msg.substring(i,i+1));


        }

        // 2 character :

        for (int i = 0; i <=charCount-2 ; i++) {

            System.out.println(msg.substring(i, i + 2));

        }



        // 3 character :

        for (int i = 0; i <=charCount-3 ; i++) {

            System.out.println(msg.substring(i, i + 3));

        }

        // 4 character :

        for (int i = 0; i <=charCount-4 ; i++) {

            System.out.println(msg.substring(i, i + 4));

        }



    }
}
