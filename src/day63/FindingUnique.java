package day63;

import java.util.HashSet;
import java.util.Set;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signing page , once you signing with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";

        // How many unique character showed up in above sentence

        // first create a HashSet object
        // iterate over each character in above String
        // then add it to the HashSet so it can remove the duplicate for us


        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            
            charSet.add(str.charAt(i));
            
        }

        System.out.println("str.length() = " + str.length());
        System.out.println("charSet.size() = " + charSet.size());
        System.out.println("charSet = " + charSet);


        for (Character eachChar : charSet) {

            System.out.println(eachChar);
        }



    }
}
