package day52.polymorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {

        Shape s1 = new Circle("penny", 5);

        printAnyShapeArea(s1);

        Shape s2 = new Rectangle("Book",10,5);

        printAnyShapeArea(s2);

        printAnyShapeArea(new Square("Bob",6)); // here we are directly passing the sub class object
                                                            // to a method that have Shape as parameter type

        drawShape3Times(s2);
        drawShape3Times(s1);


    }

    // create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times


    public static void drawShape3Times(Shape anyShape){

        anyShape.draw();
        anyShape.draw();
        anyShape.draw();


    }




    public static void printAnyShapeArea(Shape anyShape){

        anyShape.calculateArea();
        System.out.println(anyShape.area);



    }

}
