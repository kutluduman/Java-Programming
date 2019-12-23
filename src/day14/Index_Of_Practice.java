package day14;

public class Index_Of_Practice {

    public static void main(String[] args) {

        //indexOf ----->
        //find out index of another String inside this String
                     //   01234567801   // space is also counted as character count
        String name = "Game of Java" ; // length is 12, last char index is 11

        //find out the location of Java
        // find out the location of letter 0
        // find out the location of first space

        System.out.println("Find out the location of Java");
        System.out.println( name.indexOf("Java")  ); // starts from location 8

        System.out.println("Find out the location of o");
        System.out.println( name.indexOf("o") );

        System.out.println("Find out the location of first space");
        System.out.println(name.indexOf(" "));

        System.out.println("Find out the location of uppercase O");
        System.out.println(name.indexOf("O")); //-1 means that there isn't such index



    }
}
