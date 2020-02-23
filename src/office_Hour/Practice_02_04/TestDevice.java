package office_Hour.Practice_02_04;

import java.util.ArrayList;
import java.util.List;

public class TestDevice {

    public static void main(String[] args) {

        // references : d, s , i
        // objects : new Samsung(), new Iphone()

        // reference(d2) type parent class/Interface
        // object(new Samsung()) is a child class
        // reference decides what you can reach to
        // parent cannot use the child's method
        // child can use parent's method
        // two types of polymorphism ----> 1 : Dynamic which is method overriding
                                            // 2 : static = method overloading


        WaterProof w = new Samsung();
        // w does not have access for any variable or methods
        // in device or Samsung


        Device d2 = new Samsung();
        // d2 does not have access any variable or method
        // created in Samsung

        // reference type decides what to access




        Samsung s = new Samsung();
        s.price = 999;
        s.color = "blue";
        s.size = 7;
        s.takePicture();

        s.call(); // I can use call() with Samsung because Samsung and Device are IS-A relationship.
        s.sendMessage();

        System.out.println("============================");

        Iphone i = new Iphone();
        i.call();
        i.sendMessage();

        System.out.println("============================");

        System.out.println("s = " + s);

        Device d3 = new Iphone(); // d3's type is device == d3 can have access only variables and methods in device
        d3.size=8;                  // not in Iphone
        d3.price = 374;



        Iphone i2 = new Iphone();
        i2.price = 1000;
        i2.size = 6;
        i2.platform = "iOS";
        i2.call(); // calling with device method


    }
}
