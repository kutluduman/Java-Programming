package day15;

public class String_Case_Sensitive {

    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println(name.contains("st"));
        // I want to check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then heck for ST


        String upperCaseName = name.toUpperCase(); // ARYA STARK

        System.out.println("uppercaseName contains St or not ? " + upperCaseName.contains("ST"));

        String lowerCaseName = name.toLowerCase();

        System.out.println("lowercaseName contains st or not ? " + lowerCaseName.contains("st"));

        // This is called method chaining, combining multiple method call
        // make my name all lowercase(String) then check whether it contain lowercase st


        System.out.println(    name.toLowerCase().contains("st")    ); // combining two string methods
        //System.out.println(   name.length().                 ); // here it does not work because the first step is
                                                                // a primitive. Its a int, that's why it cannot perform
                                                                // method or action





    }

}
