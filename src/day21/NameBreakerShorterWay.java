package day21;

public class NameBreakerShorterWay {


    public static void main(String[] args) {


        // Store yor name into a variable name loop through each and every letters and print
        // if you see letter b ---> get out of the loop


        String name = "Kutluhan" ;
        int charCount = name.length();
        int lastIndexOf = charCount-1;

        for (int i = 0; i <=lastIndexOf ; i++) {






            if (name.substring(i,i+1).equalsIgnoreCase("h"))  {
                System.out.println("Found it");
                break;

                // key thing is that we get out when we see


            }
            System.out.println(name.substring(i,i+1));



        }






    }

}
