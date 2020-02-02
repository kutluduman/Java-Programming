package repl_it;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodsWithStr15 {

    public static void main(String[] args) {


    }

    public static boolean isAnagram(String word1, String word2) {


        word1 = word1.toLowerCase().replace(" ","");
        word2 = word2.toLowerCase().replace(" ","");

        String[] w1 = word1.split("");
        String[] w2 = word2.split("");


       Arrays.sort(w1);
       Arrays.sort(w2);

       return Arrays.equals(w1,w2);



    }

}
