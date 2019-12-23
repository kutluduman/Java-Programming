package day31;

public class MethodIntro {

    public static void main(String[] args) {


        // WHY DO WE NEED TO HAVE A METHOD
        // REUSABLE CODE !!!! AVOID CODE DUPLICATED


        // DO NOT CREATE A METHOD INSIDE MAIN METHOD
        // IT CAN BE ANYWHERE INSIDE THE CLASS OUTSIDE MAIN METHOD


        // Two ways to call static methods
        // ClassName.methodName(external data is needed)


        // if you are in the same class,
        // methodName(external data if needed)


        MethodIntro.sayHello();

        System.out.println();

        sayHello();


    } // main method ends here

    // Do not create a method inside main method
    public static void sayHello() {

        System.out.println("Hello World");
        System.out.println("My name is Mr.Robot");
        System.out.println("I love Java");


    }


}
