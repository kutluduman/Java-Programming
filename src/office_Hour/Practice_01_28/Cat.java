package office_Hour.Practice_01_28;

public class Cat extends Animal {

    String eyeColor;

    @Override

    public void call(){

        System.out.println("Cat is calling");


    }

    public void run(){

        System.out.println("The cat is running ");

    }

    public void sleep(){

        System.out.println("Cat is sleeping");
    }

}
