package office_Hour;

import java.util.Arrays;

public class Practice_01_02 {

    public static void main(String[] args) {

        String str = "AAABBBDDDEEE";     // Expected Result : ABDE

        System.out.println(removeDup("AAABBBDDDEEE"));

        System.out.println(frequency("AABBCC", 'C'));

        frequencyOfChars("AABBCCC");

    }

    public static String removeDup(String str) {

        String result1 = ""; // we want store non duplicate string to here

        for (int x = 0; x < str.length(); x++) {

//            if (!result1.contains(str.substring(x, x + 1))) {
//
//                result1 += str.substring(x, x + 1);
//
//
//            }     or

            if (!result1.contains("" + str.charAt(x))) {

                result1 += "" + str.charAt(x);


            }


        }

        return result1;


    }


    public static int frequency(String str, char iChar) {


        int count = 0;

        char[] arr = str.toCharArray();        // ['A','B','C']

        for (char each : arr) {

            if (each == iChar) {

                count++;


            }


        }


        return count;

    }


    public static void frequencyOfChars(String str) {

        String nonDup = removeDup(str);


        for (int i = 0; i < nonDup.length(); i++) {

            int count = frequency(str, nonDup.charAt(i));

            System.out.print("" + nonDup.charAt(i) + count);

        }


    }


}
