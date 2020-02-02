package day50;

public class MathTest {

    public static void main(String[] args) {


        Addition q1 = new Addition(10, 90);
        System.out.println("q1 = " + q1);
        q1.calculate();
        System.out.println("q1 = " + q1);


        Subtraction q2 = new Subtraction(90, 10);
        System.out.println("q2 = " + q2);
        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(10, 90);
        System.out.println("q3 = " + q3);
        q3.calculate();
        System.out.println("q3 = " + q3);


        Multiplication q4 = new Multiplication(4, 5);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);

        Division q5 = new Division(10, 0);
        System.out.println("q5 = " + q5);
        q5.calculate();
        System.out.println("q5 = " + q5);

    }
}
