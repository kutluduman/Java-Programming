package day44;

public class Car extends Vehicle {

    int mileage;


    public static void main(String[] args) {

        Car c1 = new Car();
        c1.mileage = 39637;
        System.out.println("c1.mileage = " + c1.mileage);
        c1.setYear(2016);
        c1.make="corolla";
        System.out.println("c1.make = " + c1.make);

        System.out.println("c1.getYear() = " + c1.getYear());


    }

}
