package day63;

import java.util.*;

public class FindingCharacterShowedUpAtLeastOnce {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signing page , once you signing with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";


        String[] eachCharStrArray = str.split("");
        System.out.println("Arrays.toString(eachCharStrArray) = " + Arrays.toString(eachCharStrArray));

        List<String> lst = new ArrayList<>(Arrays.asList(eachCharStrArray));

        Set<String> charSet = new HashSet<>(lst);
        System.out.println("charSet = " + charSet);

        // doing in one shot

        // Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));


    }
}
