package office_Hour.Practice_01_28;

// number one rule : no object creation when its abstract class

public abstract class Animal implements Zoo {

    // information ---> instance variable

    int age;
    String color;
    String breed;

    // variables ----> instance, local, static


    // Actions ---> instance methods

    public void eat() {

        System.out.println("The animal is eating");

    }


    public void call() {

        System.out.println("The animal is calling...");

    }


    // what if we just declare a method that should be in child class, and they
    // are different body

    // with this abstract method, I want this method to appear in both sub classes,
    //yet they should have different body

    public abstract void run();


}
