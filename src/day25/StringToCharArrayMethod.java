package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {


    String name = "Alesya" ;

        // how would you store each and every character
        // to an char array from above name
        // without using method we are about to learn

    char[] namesChar = new char[name.length()];

//     namesChar[0]=name.charAt(0);
//     namesChar[1]=name.charAt(1);
//     namesChars[2] = name.charAt(2);
//     namesChars[3] = name.charAt(3);
//     namesChars[4] = name.charAt(4);
//     namesChars[5] = name.charAt(5);


        // using for loop to fill up the array one by one
        for (int x = 0; x <namesChar.length ; x++) {


            // take each character of name and fill the char array values
            namesChar[x]=name.charAt(x);

        }
        System.out.println("Arrays.toString(namesChar) = " + Arrays.toString(namesChar));


        char[] namesChar2 = name.toCharArray();
        System.out.println("namesChar = " + Arrays.toString(namesChar2));


        String myName = "Kutluhan";

        char[] myName2 = new char[myName.length()];

        for (int i = 0; i <myName2.length ; i++) {

            myName2[i] = myName.charAt(i);


        }
        System.out.println("Loop version = " + Arrays.toString(myName2));


      char[] myName3 = myName.toCharArray();

        System.out.println("Arrays.toString(myName3) = " + Arrays.toString(myName3));

    }
}
