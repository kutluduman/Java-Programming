package day50;

// abstract class is not required to implement
// inherited abstract methods of the interface

public abstract class Shape implements Drawable {

    String name;
    double area;


    // why abstract class have constructor even if we cannot use it to create an object?
    // it exits purely to let sub class to call and reuse the functionality in sub class constructor


    public Shape(String name) {

        this.name = name;


    }

    public abstract void calculateArea();


}
