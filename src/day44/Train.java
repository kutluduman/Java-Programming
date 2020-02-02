package day44;

// what is inherited from Super Class(Vehicle)

// fields and methods that are visible to the sub classes are inherited
// constructors are not inherited


public class Train extends Vehicle {

    int wagonCount;

    public void makeChoChoSound() {

        System.out.println("Chooofff Chooooofff");


    }

    public static void main(String[] args) {

        Train t1 = new Train();

        t1.makeChoChoSound();

        t1.make = "Thomas";
        t1.setYear(1999);
        // t1.year=1999; this disappears because we made private,
        // so we use the setters method

        t1.start();
        t1.goForward();


    }


}
