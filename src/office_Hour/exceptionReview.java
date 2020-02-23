package office_Hour;

public class exceptionReview {

    public static void main(String[] args) throws Exception {

        hi();
        test1();

        int num = 9;

        System.out.println(num);

        // Exceptions :

        // 1. Compile time exception == checked exception
        // right after you write code, JavaC checks syntax

        // 2. Runtime Exception == unchecked
        // JRE jvm libraries run your code


        // 2 ways to handle exceptions
        // 1 try catch

        try {
            String word = "java";
            System.out.println(word.charAt(6));

        } catch (Exception e) {

            System.out.println("Take care of Index");


        } finally {
            System.out.println("Print this whatever happens");
        }


        // 2 throws keyword
        // mainly used for methods


        // throw keyword : it comes with new keyword, throw new exception


    }

    public static void test1() throws Exception {

        String name = "Cybertek";
        System.out.println(name.charAt(20));

    }

    public static void hi() {

        System.out.println("hi hi ");

    }

    public static void test2() {

        // I write some code, and I think it related to Math
        // and I want to throw Arithmetic Exception
        throw new ArithmeticException(); // I am not handling but I am throwing exception

    }

    public static void test3() {

        test2();

    }


}
