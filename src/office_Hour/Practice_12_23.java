package office_Hour;

public class Practice_12_23 {

    public static void main(String[] args) {

        // method it's just a reusable peace of code
        // with return type and without(void)
        // method can be with parameters or without
        // return gives back value
        // void means don't give anything back


        String word = "computer";

        System.out.println(reverseString("akbar"));

        add(15, 15); // we cannot store as variable or return something. it just prints out

        int sum = addWithReturn(15, 15); // with return it gives back value and we can store into variable
        System.out.println(sum);


    }

    public static String reverseString(String str) {

        String reversedString = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedString += str.charAt(i);

        }


        return reversedString;

    }

    public static void add(int num1, int num2) {

        System.out.println(num1 + num2);


    }

    public static int addWithReturn(int num1, int num2) {


        return num1 + num2;


    }


}
