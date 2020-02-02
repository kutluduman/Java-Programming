package day48;

public class Ball implements Bouncible {


    String shape;
    String color;


    public Ball(String shape, String color) {

        this.shape = shape;
        this.color = color;

    }

    public void bounce() {

        System.out.println("Ball is bouncing and gravity is " + gravity);

    }

    @Override

    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
