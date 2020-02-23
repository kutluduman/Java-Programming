package office_Hour.Practice_02_04;

public class Iphone extends Device {

    String platform;

    @Override
    public void call() {


        System.out.println("Calling with Iphone");
    }

    @Override
    public void sendMessage() {

        System.out.println("Sending message via iMessage");

    }

    public void faceTime(){

        System.out.println("Talking to Akbar through face time");

    }

    @Override
    public String toString() {
        return "Iphone{" +
                "platform='" + platform + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
