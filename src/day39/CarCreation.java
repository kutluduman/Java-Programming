package day39;

public class CarCreation {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Honda";
        car1.model = "Crv";
        car1.year = 1995;
        car1.color = "Silver";
        car1.goForward();
        car1.printAge();
        car1.changeColorTo("blue");

        System.out.println(car1.brand + "|" + car1.model + "|" + car1.year + "|" + car1.color);


        Car car2 = new Car();
        car2.year = 2017;
        car2.model = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        System.out.println("car2.make = " + car2.model);
        System.out.println("car2.color = " + car2.color);

        // Change the color of Hyundai to the color of Toyota


        car2.color = car1.color;


    }
}
