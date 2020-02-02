package day50;

public class Square extends Shape {

    int length;


    public Square(String name, int length) {

        super(name);
        this.length = length;

    }


    @Override

    public void calculateArea() {

        area = length * length;

    }

    @Override

    public void draw() {

        System.out.println("4 equal lines connected to each other with color " + COLOR);

    }


    @Override
    public String toString() {


        return "Square{" +
                "length=" + length +
                '}';
    }
}
