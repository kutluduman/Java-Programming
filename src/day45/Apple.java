package day45;

public class Apple extends Fruit {


    //First line of any constructor is automatically calling
    // Super() if we don't call any


    // if we don't have any constructor
    // we will get default constructor
    // and compiler automatically call
    // no arg constructor of super class by inserting super()

    public Apple() {

        // I want to reuse the functionality
        // already written in super class constructor
        // we can use super() or super(arguments here)
        // to call super class's constructor
        // super();


        // can we call two constructors?
        // NO!
        //       super("hello"); // calling constructor with one argument


        System.out.println("Message from Apple Constructor");

    }

    public static void main(String[] args) {

        Apple a1 = new Apple();


    }


}
