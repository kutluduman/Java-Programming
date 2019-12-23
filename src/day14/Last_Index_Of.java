package day14;

public class Last_Index_Of {

    public static void main(String[] args) {


        String name = "Game of Java" ;


        // find out last location the letter a shows up
        // find out the last location the character space shows up
        // find out the last location the character Ga shows up
        // find out the last location the character Kawa shows up

        System.out.println("find out last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));

        System.out.println("find out the last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("find out the last location the character GA shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("find out the last location the character Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        if (name.indexOf("Kawa") > -1) {

            System.out.println("Kawa found");    // another way of checking a string inside another string

        } else {

            System.out.println("No Kawa");
        }




    }
}
