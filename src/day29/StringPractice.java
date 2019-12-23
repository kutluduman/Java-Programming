package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        // Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK


       String[] heroSplit = hero1.split("-");
       String heroCode = heroSplit[0];
       String fullName = heroSplit[1];

        System.out.println("Hero split : " +Arrays.toString(heroSplit));

        System.out.println("Hero code is " + heroCode +", and Identity is " +fullName );

        //The initial of the Hero is CK


        int indexOfSpace = fullName.lastIndexOf(" ");

        String initial = fullName.substring(indexOfSpace+1,indexOfSpace+2);

        System.out.println(fullName.charAt(0)+initial);









    }
}
