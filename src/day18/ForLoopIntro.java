package day18;

public class ForLoopIntro {

    public static void main(String[] args) {

        // count 1 to 5

        // for loop () has 3 parts separated by;
        //first part initializing;
                // it will run only once when you enter the loop
        //termination condition : checking the condition. Loop will stop if it is false
                                // It will be checked every time
        //Update/Increment or decrement: to change the condition eventually
                // It will run after each iteration



        for (int i = 1 ; i<=5 ; ++i  ) {

            System.out.println("i = " + i);
            System.out.println("Happy Birthday");


        }


        
        for (int counter = 5 ; counter>0; --counter)
            System.out.println("counter = " + counter);


    }
}
