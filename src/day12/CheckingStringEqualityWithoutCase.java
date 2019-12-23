package day12;

import com.sun.security.jgss.GSSUtil;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {


        String userName = "Kutlu123" ;

        boolean userNameCorrect = userName.equals("KUTLU123") ;

        System.out.println( userNameCorrect);

        boolean ignoreNameCheck = userName.equalsIgnoreCase("KUTLU123") ;


        System.out.println(ignoreNameCheck);

        boolean anotherIgnoreCheck = userName.equalsIgnoreCase( "KuTLu") ;

        System.out.println(anotherIgnoreCheck);









    }



}
