package day35;

public class StringToIntegerparsing {

    public static void main(String[] args) {

        /**
         * 			I have a employee ID  : "FB-457"
         * 			give me the employee number and store it into a number
         */

//        String strNum = "100";
//        int num = Integer.parseInt(strNum);
//
//        System.out.println("num = " + num);
//
//        String empID = "FB-457";
//        int empID = Integer.parseInt(empID);


        /**
         * Integer class is class coming from java.lang package
         * It's primarily used for wrapping up primitive value and treat it object
         * what we will focus here i s though
         * many useful static methods it provide already
         * parseInt is a static method of Integer class
         * It will turn a String that has only numbers and return int result
         * if we have any non-numerical character ---> It will throw NumberFormatException
         */


//      String[] empIDSplit = empID.s("-");
//      String idStr = IDSplit[1];
//      int id = Integer.parseInt(idStr);
//
//        System.out.println("id = " + id);


        // I have a String called twoNumbers

        String twoNumbers = "100,600";

        // I want to add them and give the result

        String[] twoNumbersSplit = twoNumbers.split(",");

        int num1 = Integer.parseInt(twoNumbersSplit[0]);
        int num2 = Integer.parseInt(twoNumbersSplit[1]);

        int sum = num1 + num2;

        System.out.println("sum = " + sum);
        
        int num1_1 = Integer.valueOf(twoNumbers.substring(0,3)) ;
        int num2_1= Integer.valueOf(twoNumbers.substring(4));
        
        int sum_1 = num1_1+num2_1;
        System.out.println("sum_1 = " + sum_1);


    }
}
