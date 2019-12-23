package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B' ;

        System.out.println(grade);

        int numberGrade = (char) grade;

        int letterInNumber = 'B' ;

        int letterInNumber2 = 'b' ;

        System.out.println(numberGrade);

        System.out.println(letterInNumber);

        System.out.println(letterInNumber2);


        char myFirstChar = (char) 100 ;

        System.out.println(myFirstChar);


        int firstChar = 'k' ;
        int secondChar = 'u' ;
        int thirdChar = 't' ;
        int fourChar = 'l' ;
        int fifthChar = 'u' ;
        int sixthChar = 'h' ;
        int seventhChar = 'a' ;
        int eightChar = 'n' ;

        System.out.println(firstChar+ " " +
                "" +secondChar+ " " +thirdChar+ " "
                +fourChar+ " " +fifthChar+ " " +sixthChar+ " "
                +seventhChar+ " " +eightChar);



        char letterA = 'a' ;

        System.out.println( letterA + 1 );

        System.out.println(" " + letterA + 1 ); // outcome is different because of string




    }

}
