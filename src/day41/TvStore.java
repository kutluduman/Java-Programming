package day41;

public class TvStore {

    public static void main(String[] args) {

        Tv tv1 = new Tv();
        tv1.brand="Sony";

        System.out.println("tv1 = " + tv1);

        tv1.turnOn();


    
        tv1.setCurrentChannel(12);
        System.out.println("tv1 = " + tv1);

    }
}
