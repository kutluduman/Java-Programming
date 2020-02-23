package day59;

public class General {

    public static void main(String[] args) {

        Object o = new String("abc");

        // can I get the first char using o : No


        String str = "";

        // If you have multi try catch block
        // the most specific type(child type) should come first
        // the more generic type(super type) should come after


        try {

            System.out.println(str.charAt(0));

        } catch (NullPointerException n) {

            System.out.println("No object here, its empty");


        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("This is the rest of Exceptions");

        }

        System.out.println("The End");


    }
}
