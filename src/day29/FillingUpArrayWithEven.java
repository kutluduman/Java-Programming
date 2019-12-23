package day29;

import java.util.Arrays;

public class FillingUpArrayWithEven {

    public static void main(String[] args) {


        int[] numbers = new int[100];


        numbers[0]= 0 ;


        for (int i = 0; i <numbers.length ; i++) {

            numbers[i]= i *2 ;

        }


        System.out.println(Arrays.toString(numbers));


    }
}
