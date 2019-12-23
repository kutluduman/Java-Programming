package day20;

public class ReverseAString {

    public static void main(String[] args) {

        // given A string variable name with value
        // reverse this name and store reversed value into
        // another String variable reversedName

        String name = "Jon Snow" ;
        String reversedName = "";

        // if with scanner :
        
        // int lastCharIndex = name.length()-1;
        
        
        for (int x = 7 ; x >= 0 ; --x) {

            System.out.println(name.charAt(x));


          reversedName+=name.charAt(x); // storing the variable




        }


        System.out.println("reversedName = " + reversedName);

    }

}
