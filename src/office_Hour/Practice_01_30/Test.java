package office_Hour.Practice_01_30;

public class Test {

    public static void main(String[] args) {

        Jeep obj1 = new Jeep();
        obj1.start();
        System.out.println("================================");

        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println("=================================");

        Tesla obj3 = new Tesla();
        obj3.start();
        obj3.hasBattery();


    }


}
