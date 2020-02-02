package day47;

public class ElectricCar extends Car {

    int batteryLevel;


    @Override

    public void start() {

        System.out.println("This is how electric car start ");


    }

    @Override

    public void goForward() {

        System.out.println("going forward");

    }


    @Override

    public void goBackward() {

        System.out.println("going backward");

    }

    @Override

    public void turn(String direction) {

        System.out.println("turning " + direction);

    }


    public static void main(String[] args) {


        ElectricCar e1 = new ElectricCar();


        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right");


    }


}
