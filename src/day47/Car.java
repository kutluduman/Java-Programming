package day47;

// I don't need to create car object using this class
// I only want this class to be super class to provide
// reusable fields and methods for sub classes
// This class is designed to be a super class
public abstract class Car {

    int year;
    String brand;

// Abstract class can have abstract method
// it has abstract keyword
// and it does not have any body, Does not have {}
// it ends with ;
// it's meant to be overridden to provide body
// in sub class

    public abstract void start();

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);


}
