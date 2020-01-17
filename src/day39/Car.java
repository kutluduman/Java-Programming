package day39;

public class Car {

    String brand;
    String model;
    int year;
    String color;


    // instance methods are tied to the object
    // it does not have static keyword
    // we need an object when we call them

    public void goForward() {

        System.out.println(model + " Going Forward");




    }


    public void printAge() {

        System.out.println("car age " + (2020-year));


    }


    public void changeColorTo(String newColor) {

        color=newColor;

    }


}
