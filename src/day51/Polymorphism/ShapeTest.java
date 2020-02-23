package day51.Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        System.out.println("----------------------------");

        // please create Array of shape to store
        // 5 concrete Shape object
        // and call the draw the method on each of them
        Shape[] allShapes = {s1, s2, s3, new Triangle(), s2};

        for (Shape eachShape : allShapes) {

            eachShape.draw();

        }

        System.out.println("----------------------");

        for (int i = 0; i < allShapes.length; i++) {

            allShapes[i].draw();

        }

        System.out.println("----------------------------");

        // Also try to create ArrayList of Shape
        // and store 4 concrete Shape objects
        // and call the draw method on each of them


        List<Shape> listShape = new ArrayList<>(Arrays.asList(s1, s2, s3, new Triangle()));

        for (Shape eachShape : listShape) {

            eachShape.draw();

        }

        System.out.println("----------------------");

        for (int i = 0; i < listShape.size(); i++) {

            listShape.get(i).draw();

        }

        System.out.println("-----------------------");

        // Create a different class with main method:
        // and try to use the Shape, Circle, Triangle class from day 50
        // Create list of Shape and calculate their area


    }
}
