package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {


        byte letterCount = 26 ;

        System.out.println("The letter count is " + letterCount ) ;

        short sheepCount = 300 ;

        System.out.println("The number of sheep in the city is " + sheepCount );

        int catCount = 20 ;

        System.out.println("Allen has " + catCount + " cats");

        long mileToSun = 1000000000l ;

        System.out.println("Distance from earth to sun is " + mileToSun );



        // ------------------- floating point -------------------


        float priceOfBanana = 1.99f ; // you must add f at the end of number to indicate this is float/decimal data type

        System.out.println("The price of banana is " + priceOfBanana);



        float priceOfPatatoe = 2.499F ; // upper or lower case of f does not matter

        System.out.println("The price of potatoe is " + priceOfPatatoe);


        // ------------- larger floating point numbers -----------------------

        double priceOfIpad1 = 355.99d ;

        System.out.println("The price of ipad 1 is " + priceOfIpad1) ;


        double priceOfIpadPro = 1024.99D ;

        System.out.println("The price of ipad pro is " + priceOfIpadPro);

        // compiler automatically assume its a double so its not required to have a d
        // however for good programming habit, add them always
        double priceOfMac = 2299.99 ;

        System.out.println("The price of mac is " + priceOfMac) ;

        // If you have a whole number by itself compiler automatically assume its an int
        // If you have a fractional number by itself, compiler automatically assume its an double










    }


}
