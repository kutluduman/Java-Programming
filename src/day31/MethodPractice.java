package day31;

import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args) {


        ageInfo();


    }

    public static void ageInfo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();

        System.out.println(age);


    }


}
