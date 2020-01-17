package office_Hour;

import java.util.Arrays;

public class Practice_12_27_3 {

    public static void main(String[] args) {

        // write a method that can verify any number if it's even or odd

        oddEven(24);
        oddEven(15);

        System.out.println(kmToMiles(1));

        System.out.println(gallonsToLitres(1));

        int[] arr = {2, 3, 1, 5};
        descendingOrder(arr);

        calculate(2, 3, "*");

        calculate(3, 3, "@");

        calculate2(10, 10, '*');

        calculate2(10, 20, '@');


    }


    public static void oddEven(int number) {

        if (number % 2 == 0) {

            System.out.println("Number is even");

            return;

        }

        System.out.println("Number is odd");

    }

    /**
     * task 01 : write a method that can convert km to miles
     * hint : 1 km = 0.612 miles
     */


    public static double kmToMiles(double km) {

        double miles = km * 0.612;


        return miles;


    }

    /**
     * task 02 : write a method that can convert gallons to litres
     * hint : 1 G = 3.75 L
     */

    public static double gallonsToLitres(double gallons) {

        double litres = gallons * 3.75;


        return litres;


    }

    /**
     * task 03 : print int array in descending order
     */


    public static void descendingOrder(int[] arr) {

        // user passed [2,3,1,5]

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }


    }

    /**
     * Task 04 :
     */


    public static void calculate(int a, int b, String operators) {


        if (operators.equals("+")) {

            System.out.println(a + b);

        } else if (operators.equals("-")) {

            System.out.println(a - b);

        } else if (operators.equals("*")) {

            System.out.println(a * b);

        } else if (operators.equals("/")) {

            System.out.println(a / b);

        } else if (operators.equals("%")) {

            System.out.println(a % b);

        } else {

            System.out.println("Invalid Operator");
        }


    }

    public static void calculate2(int a, int b, char operator) {

        switch (operator) {

            case '+':

                System.out.println(a + b);

                break;

            case '-':

                System.out.println(a - b);

                break;

            case '*':

                System.out.println(a * b);

                break;

            case '/':

                System.out.println(a / b);

                break;

            case '%':

                System.out.println(a % b);

                break;

            default:

                System.out.println("invalid operator");


        }


    }

}
