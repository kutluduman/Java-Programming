package day41;

public class Tv {

    String brand;
    boolean isOn;
    int currentChannel;


    public void turnOn() {


        if (isOn == false) { // checking for equality ==

            isOn = true; // assigning the value =
            System.out.println("Turning on TV");
        }


    }

    public void turnOff() {


        if (isOn == true) {

            isOn = false;
            System.out.println("Turning Off TV");
        }

    }

    public int getCurrentChannel() {


        return currentChannel;

    }

    public void setCurrentChannel(int newChannel) {

        if (newChannel < 0 || newChannel > 50) {

            System.out.println("Invalid Channel, Getting Out");
            return; // early exit from the method

        }


        if (isOn == true) {

            currentChannel = newChannel;

        } else {

            System.out.println("Turn on the Tv first");


        }


    }


    public String toString() {


        return "Tv{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
