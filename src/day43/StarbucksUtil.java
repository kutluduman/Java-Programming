package day43;

public class StarbucksUtil {


    public static void main(String[] args) {

        String myString = new String("Hello");
        printStringInfo(myString);

        // we would need an object of current class if we wanted to call
        // instance method of current class
        // if it not static it is instance
//        StarbucksUtil util = new StarbucksUtil();
//        util.printStringInfo(myString);

        Coffee c = new Coffee("Blonde",5,1.6);
        printCoffeeInfo(c);

        Coffee c1 = new Coffee();
        printCoffeeInfo(c1);

        printCoffeeInfo(new Coffee("Intensito",10));





    }

    // Create a static method to accept a coffee object and print it's information
    // like this : This coffee is : name, price is <price> , caffeine level is <level>
    public static void printCoffeeInfo(Coffee co) {

        System.out.println("This coffee is " + co.getType());
        System.out.println("Price is : " + co.getPrice());
        System.out.println("Caffeine level is " + co.getCaffeineLevel());


    }

    public static void printStringInfo(String str) {

        System.out.println("The first character is " + str.charAt(0));
        System.out.println("Last character is " + str.charAt(str.length() - 1));


    }


}
