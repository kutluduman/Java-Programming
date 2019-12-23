package day29;

import java.util.Arrays;

public class HeroIdentity {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        // hide this hero identity
        // String heroX = "Superman-**********" ;

        // given a String with hero code and name separated by
        // turn this String into hero code and * with same length as hero name

        String[] heroSplit = hero1.split("-");

        System.out.println(Arrays.toString(heroSplit));

        String heroName = heroSplit[0];
        String identity= heroSplit[1];

        int nameCharCount = identity.length();
        String stars="";

        for (int i = 0 ; i<nameCharCount ; i++) {

            stars+="*";

        }

        String heroX = heroName+"-"+stars;

        System.out.println(heroX);



    }
}
