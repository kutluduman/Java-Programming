package day14;

public class String_Method_CharAt {


    public static void main(String[] args) {

        //charAt method of String
        // it will return a character at certain location specified

        String name = "Kutluhan ";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(6));
        System.out.println(name.charAt(7));


        String aName = "Arya" ;
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);

        System.out.println( c1+c2+c3+c4 ); // this gives number from table. do not add character's that why
        System.out.println( c1+ " " +c2+ " " +c3+ " " +c4 ); // this is the correct method







    }
}
