package day06;

public class OddOrEven {


    public static void main(String[] args) {


        int myNumber = 10 ;
        int yourNumber = 11 ;

        System.out.println("Remainder of dividing by 2 : " + myNumber%2 ); //even

        System.out.println("Your Number Reminder of dividing by 2 : " + yourNumber%2 ); //odd

        System.out.println("adding my number to your number : " + yourNumber+myNumber ); // we get 1110 because it sees string

        System.out.println("adding my number to your number : " + (yourNumber+myNumber) ); // answer 21, () makes it priority



    }

}
