package day20;

public class WorkingWithMoreThanOneCharacter_String {

    public static void main(String[] args) {


        // given a String with even number character count
        // print 2 characters in one line
        // for example : Gokyuzum
        // result should be:

        //   Go
        //   ky
        //   uz
        //   um





//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6));
//
//          int x = 0 ;

//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));
//        x= x+2;
//        System.out.println(name.substring(x,x+2));

        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = name.length()-1;



        for (int x = 0 ; x<=lastCharIndex-1 ; x+=2) {

            System.out.println(name.substring(x,x+2));

        }




    }


}
