package day24;

import java.util.Arrays;

public class DoubleArrayTask {

    public static void main(String[] args) {

     double[] items = {4.0d,7.1d,5.3d};

     String pricesString = Arrays.toString(items);


        for (int i = 0; i <=pricesString.length()-1 ; i++) {

            System.out.println("Character at index" +i +"is: "+pricesString.charAt(i) );


        }












    }
}
