package day10;

public class Answer {

    public static void main(String[] args) {

        String myAnswer;
        int myNumber = 55;

        if (myNumber % 5 == 0) {

            myAnswer = "Fizz Number";


        } else {

            myAnswer = "Not a Fizz Number";
        }

        System.out.println("My number is " + myNumber + " and it is a " +myAnswer);

    }
}