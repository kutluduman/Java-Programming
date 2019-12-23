package day13;

public class Test_String_Start_With_Or_End_With {
    public static void main(String[] args) {



    String name = "Muge" ;

    // check whether a String start with another String

        System.out.println(name.startsWith("Mu"));

        System.out.println(name.startsWith("Mac"));

        System.out.println(name.startsWith("mu")); // false because case sensitive

    // check whether a String end with another String

        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("ge"));

        System.out.println(name.endsWith("E"));
        System.out.println(name.endsWith("ar"));
        System.out.println(name.endsWith("k"));

    }

}
