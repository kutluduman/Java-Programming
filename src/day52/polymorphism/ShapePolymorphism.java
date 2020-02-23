package day52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {

//        Circle s1 = new Circle("penny",5);
//        Shape s1 = new Circle("penny",5);
        Object s1 = new Circle("penny", 5);
//        Drawable s1 = new Circle("penny", 5);


        // Only the Reference Type decide what you can access with that variable
        //      s1.draw();

        System.out.println(s1.toString());


        // How do I know what is the actual object type
        System.out.println(s1.getClass().getSimpleName());


    }

    // create a method that accepts any Shape and print out the calculated area

    public static void printAnyShapeArea(Shape anyShape){



    }

}
