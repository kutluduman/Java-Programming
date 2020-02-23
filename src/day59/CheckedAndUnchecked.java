package day59;

import java.io.IOException;

public class CheckedAndUnchecked {

    public static void main(String[] args) {

        String x = "abc";
        //      System.out.println(x.charAt(100));

//        throw new RuntimeException("just throwing it out!");

        try {

            throw new IOException("Just throwing this away");

        } catch (IOException e) {

            System.out.println("Exception Caught");

        }

    }
}
