package day05;

import java.util.Scanner;

public class HourlyWage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("What is your hourly wage");

        int hourlyWage = scan.nextInt();

        double yearlySalary = hourlyWage * 2080 ;

        System.out.println("Your " + hourlyWage + " dollars hourly wage is "
                + yearlySalary +
                " dollars as yearly salary");





    }



}
