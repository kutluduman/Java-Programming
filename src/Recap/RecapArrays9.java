package Recap;

import java.util.Arrays;

public class RecapArrays9 {

    public static void main(String[] args) {

        String sentence = "Today is a great day, Good day to learn Java";

        String[] arr = sentence.split(" ");


        System.out.println(Arrays.toString(arr));


        String email = "FirstName_LastName";
        String[] arr2 = email.split("_");
        System.out.println(arr2[0]);


        String python = " Python is good, I love Python, Python is love ";

        String[] arr3 = python.split("Python");

        System.out.println(arr3.length - 1); // returns the total number python occurs in String

        String emailAddress = "Cybertek.school.batch12@gmail.com";

        String fullName = emailAddress.substring(0, emailAddress.indexOf("@"));


        String[] arr4 = fullName.split("\\.");

        System.out.println(arr4[0]);


        String abc = "ABCDEF";
        String[] arr5 = abc.split("");
        System.out.println(arr5[1]);


        String str = "Java";

        char[] arr6= str.toCharArray();
        System.out.println(Arrays.toString(arr6));


    }

}
