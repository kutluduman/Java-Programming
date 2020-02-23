package office_Hour.Practice_02_11;

public class Parent {

    // Even if we do not see here, all classes extend Object class


    String name;
    int age;
    int SSN;


    public Parent(){



    }


    // method actions
    // void return

    public static void hi() {

        System.out.println("Hi, how are you? ");

    }

    // with return type we promise to return one data type only
    public static String hello() {

        return "Hello Hello";

    }

    // overloading
    public static void hi(String name){
        System.out.println("Hello " + name);


    }

    public void cookFood(String foodName){

        System.out.println("Cooking " +foodName);

    }

    public static void main(String[] args) {

        // call void method type ---> call by name
        hi();


        // call return method ----> two ways:

        System.out.println(hello());

        String hello = hello();

        System.out.println(hello);


    }


}
