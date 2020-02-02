package office_Hour.Practice_01_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    String brand;

    // Car has Engine, so we are using Engine as instance variable data type
    Engine e;
    // I want car object have passenger names attached to it
    //   String[] passengers;
    List<String> passengers;


    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = new String("Toyota");
        c1.e = new Engine("V6", 270);
        //       c1.passengers = new String[]{"Kevin", "Dele", "Kane"};
        c1.passengers = new ArrayList<>(Arrays.asList("Kevin", "Kylie"));

        System.out.println("c1 = " + c1);

    }

    @Override

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e + ", passengers " + //Arrays.toString(passengers)+
                passengers + '}';
    }
}
