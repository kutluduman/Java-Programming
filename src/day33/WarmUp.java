package day33;

public class WarmUp {

    public static void main(String[] args) {

        String spelledName = getSpelledName("Kutluhan");
        System.out.println("spelledName = " + spelledName);
        System.out.println(getSpelledName("Zeynep"));

        System.out.println();

        System.out.println(getSpelledName2("Aybars"));

    }

    public static String getSpelledName(String name) {

        String result = "";

        for (int i = 0; i <name.length() ; i++) {

            result = result+ name.charAt(i);

            // concatenate dash (-) if we are not at last character

            if (i != name.length()-1){

                result += "-";

            }

        }


        return result;

    }

    public static String getSpelledName2 (String name) {

        String result = "";
        // keep adding dash until right before last character
        // then concatenate last character

        for (int i = 0; i <name.length()-1 ; i++) {

            // this loop will add dash after each character
            // until 2nd character from the last

            result+=name.charAt(i)+"-";

        }

        // result has everything but last character
        // so we need to add the last character back to the result

        return result+name.charAt(name.length()-1) ;

    }


}
