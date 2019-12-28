package day33;

public class ReturnKeywordPractice {

    public static void main(String[] args) {


        //Return keyword is used to return a value out of method
        // it also used to get out of your method
        // the moment the return line get executed, the method will finish running


        System.out.println(calculateAgeFromBirthYear(1602));

    }

    public static int calculateAgeFromBirthYear(int birthYear) {

        int age;

        if (birthYear >= 1900 && birthYear <= 2020) {

            age = 2019 - birthYear;

        } else {

            return 0;

        }


        return age;

    }

}
