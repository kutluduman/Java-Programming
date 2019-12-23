package day21;

public class NameBreakerWithStringChar {


    public static void main(String[] args) {


        // Store yor name into a variable name loop through each and every letters and print
        // if you see letter b ---> get out of the loop


        String name = "Kutluhan" ;
        int charCount = name.length();
        int lastIndexOf = charCount-1;

        for (int i = 0; i <name.length() ; i++) {


            String currentChar = name.substring(i,i+1);
      //      System.out.println( currentChar);


            if (currentChar.equalsIgnoreCase("h")) {
                System.out.println("Found it");
                break;




            }

            System.out.println(name.substring(i,i+1));


        }






    }

}
