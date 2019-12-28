package day34;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        System.out.println("Method overloading");


        System.out.println(12);


        String name = "overloading";

        System.out.println(name.substring(6));
        System.out.println(name.substring(1, 4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2));

        /**
         *  Method overloading:
         *  using same name and different parameter for methods
         *  to reuse the name for similar actions
         *  we cannot have two methods with same name and same method parameters
         *  // IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER
         *
         *         // method name + parameter list = method signature
         *
         *         // WE CAN NOT HAVE 2 METHODS WITH SAME METHOD NAME AND SAME METHOD PARAMETERS
         */

        sayHello();
        sayHello("Universe");
        sayHello(100);
        System.out.println(sayHello("Kutluhan", "Duman"));


    }

    public static void sayHello() {

        System.out.println("Hello, World");
    }

    public static void sayHello(String name) {

        System.out.println("Hello, " + name);

    }

    public static void sayHello(int num) {

        System.out.println("Hello, " + num);


    }

    public static String sayHello(String firstName, String lastName) {

        return "Hello " + firstName + " " + lastName;


    }
}
