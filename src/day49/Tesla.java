package day49;

public class Tesla extends Vehicle implements Autonomous, Chargeable {

    int horsePower;
    String model;

    public Tesla(int year, int horsePower, String model) {

        super(year);
        this.horsePower = horsePower;
        this.model = model;

    }


    public void start() {

        System.out.println("Tesla model" + model + " starts with electricity");


    }


    public void selfDrive() {

        System.out.println("Tesla model " + model + " is self driving");


    }

    @Override
    public String toString() {


        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                '}';
    }
}
