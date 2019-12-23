package day22;

public class ArrayPractice2Char {

    public static void main(String[] args) {

//            Create a char array that hold all the letters from your first name
//            and assign values using each characters of your first name
//            then print out each character



    char[] letters = new char[8];

        letters[0]= 'k' ;
        letters[1]= 'u';
        letters[2]= 't' ;
        letters[3]= 'l' ;
        letters[4]= 'u' ;
        letters[5]= 'h' ;
        letters[6]= 'a' ;
        letters[7]= 'n' ;


        System.out.println(letters[0]);
        System.out.println(letters[1]);
        System.out.println(letters[2]);
        System.out.println(letters[3]);
        System.out.println(letters[4]);
        System.out.println(letters[5]);
        System.out.println(letters[6]);
        System.out.println(letters[7]);

        System.out.println(letters); // this only happens to char arrays, does not work in others


        // we get a char represented by ascii code 0 as default value







    }

}
