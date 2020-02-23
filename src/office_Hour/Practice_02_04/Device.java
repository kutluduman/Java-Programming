package office_Hour.Practice_02_04;


public abstract class Device implements WaterProof {

    int size;
    int price;


    public void call(){

        System.out.println("Calling with device");
    }

    public abstract void sendMessage();

    public abstract String toString();


}
