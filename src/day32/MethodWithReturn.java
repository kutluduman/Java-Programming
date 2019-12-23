package day32;

public class MethodWithReturn {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println("name = " + name);

        System.out.println();

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        System.out.println();


        // System.out.println( Arrays.toString(arrayObjectHere) ) ;
        // just like we can directly use the toString method above and print the value
        // we can print the result of a method call directly , if the method return a value
        System.out.println("result of doubling 100 is " + doubleTheNumber(100));


        System.out.println();

        int add14to16Result = add2Numbers(14, 16);
        System.out.println("add14to16Result = " + add14to16Result);

        System.out.println();

        System.out.println(add2Numbers(14, 16));


    }

    public static String giveMeMyName() {


        // assume getting my name
        // is multi steps complex operations
        return "Kutluhan";


    }

    // doubleTheNumber
    // create a static method that double the value of a number
    // it accept one int parameter and return doubled value of that number
    // whole purpose of writing a method that return a value
    // so we can save the result after calling the method
    // and use it somewhere else

    public static int doubleTheNumber(int num) {

        System.out.println("I am going to double the value of " + num);

        return num * 2;


    }

    public static int add2Numbers(int num1, int num2) {


        return num1 + num2;


    }

}
