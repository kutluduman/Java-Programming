package day06;

public class CoinConverter {

    public static void main(String[] args) {

        // you have 2 dollar
        // how many dime you can get 10c
        // how many quarter you can get
        // how many nickel you can get
        // how many penny can you get


        int cent = 200 ;

        // you have purchased candle for 0.74 cent
        // what would be remainder

        cent -=74;
        System.out.println( cent );

       int quarter = cent/25;

        System.out.println( quarter );

        int penny = cent%25;

        System.out.println(penny);

         //now I want to try to calculate dime for same money I got after purchase

       int dime = cent / 10;

        System.out.println(dime);

        int remainder = cent%dime;

        System.out.println(remainder);



    }




}
