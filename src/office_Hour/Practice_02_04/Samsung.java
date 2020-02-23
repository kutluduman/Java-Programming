package office_Hour.Practice_02_04;

public class Samsung extends Device {

    String color;

    @Override
    public void call() {

        System.out.println("Calling with Samsung");

    }

    @Override
    public void sendMessage() {

        System.out.println("Sending message via Samsung Chat");

    }

    public void takePicture(){

        System.out.println("Nice camera");

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
