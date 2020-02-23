package Recap;


public class SimultaneousRecap2 {

    public static void main(String[] args) {

        calculate(10, 10, "*");
        calculateGrade(95);


    }


    // write calculator method

    public static void calculate(int num1, int num2, String operator) {

        int result = 0;

        if (operator.equals("+")) {

            result = num1 + num2;


        } else if (operator.equals("-")) {


            result = num1 - num2;

        } else if (operator.equals("*")) {

            result = num1 * num2;

        } else if (operator.equals("/")) {

            result = num1 / num2;

        } else if (operator.equals("%")) {

            result = num1 % num2;

        } else {

            result = 0;

        }

        System.out.println(result);

    }

    public static void calculateGrade(int score) {

        char grade = (score >= 90 && score <= 100) ? 'A'
                : (score >= 80 && score <= 89) ? 'B' : (score >= 70 && score <= 79) ? 'C'
                : (score >= 60 && score <= 69) ? 'D' : (score >= 0 && score <= 59) ? 'F' : 'I';

        if (grade == 'I') {

            System.out.println("Invalid Score");
        } else {

            System.out.println(grade);
        }


    }


}
