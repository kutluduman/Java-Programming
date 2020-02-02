package repl_it;

public class MethodsWithStr13 {

    public static void main(String[] args) {

    }

    public static boolean isError(String line) {

       String[] splitter = line.split(" ");

       if (splitter[0].equals("error")) {


           return true;


       }


            return false ;



    }

}
