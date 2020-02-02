package day48;

// we build relationship between class and interface
// using implement keyword compared to extended keyword
// for class to class
// it will build a IS-A Relationship
// we can say Plane IS-A Flyable | inheritance
// since we are inheriting an abstract method,
// we need to provide body by overriding it.

public class Plane implements Flyable {

    String name;
    int capacity;
    int speed;


    @Override

    public void fly() {

        System.out.println("Plane is flying");

    }


    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();
        System.out.println(Flyable.HAVE_WING);

        // if we have static field in this class
        // can we access them in static field of interface

        System.out.println(Plane.HAVE_WING);




    }

}
