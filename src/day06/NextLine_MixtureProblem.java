package day06;

import java.util.Scanner;


public class NextLine_MixtureProblem {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("What's your name ? ");
        String name = input.nextLine();
        System.out.println("Your name is : " + name);

        System.out.println("What's your age ? ");
        //String age = input.nextLine();
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Your age is : " + age);

        System.out.println("What is your address? ");
        String address = input.nextLine();
        System.out.println("Your address is : " + address);



    }


}
