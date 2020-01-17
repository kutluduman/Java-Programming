package day42;

public class Bike {

    int speed;
    int gear;


    // constructor is a block of code
    // that has same name as className
    // and has no return type
    // if it does not meet above requirement
    // it will not be a constructor
    // the only time you can call this is :
    // when object is being created
    // it is not method
    // it is a constructor


    public Bike() {

        System.out.println("Hello Rider");
        gear = 1;


    }

    public Bike(int gear) {

        this.gear = gear;


    }

    public Bike(int gear, int speed) {

        this.gear = gear;
        this.speed = speed;


    }

    // this does nothing to gear and speed

    public Bike(String str) {

        System.out.println("Accept String!!!");


    }


    public String toString() {

        return "Bike{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
