package day29;

import java.util.Arrays;

public class FillingUpArrayWithString {

    public static void main(String[] args) {


        String [] loveJava = new String[300];


        for (int x = 0; x <loveJava.length ; x++) {

            loveJava[x]= (x+1) + "I love Java" ;

        }

        System.out.println(Arrays.toString(loveJava));



    }
}
