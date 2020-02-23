package office_Hour.Practice_02_13;

public class ExceptionsPractice {

    public static void main(String[] args) {

        String str = "Batch 15";

        printHello();


        try {

            char ch1 = str.charAt(10); // unchecked exception

            System.out.println(ch1); // this won't be printed

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("String index out of bound exception");


        }

        try {


            Thread.sleep(3000); // this is checked exception gives compiler error


        } catch (Exception e) {


        }
        System.out.println("Test Completed");

    }

    public static void printHello() {

        try {

            Thread.sleep(3000);
            System.out.println("Hello");


        } catch (Exception e) {


        }

    }

}
