package day31;

public class Calculator_V2 {

    public static void main(String[] args) {

//        char operator = '+';// it can be + - * /
//        int num1 = 15;
//        int num2 = 3;

        calculate('-',10,5);


    }


    public static void calculate(char operator, int num1, int num2) {


        switch (operator) {

            case '+':

                System.out.println(num1 + num2);

                break;

            case '-':

                System.out.println(num1 - num2);

                break;

            case '*':

                System.out.println(num1 * num2);

                break;

            case '/':

                System.out.println(num1 / num2);

                break;

            default:

                System.out.println("Invalid operator");


        }


    }

}
