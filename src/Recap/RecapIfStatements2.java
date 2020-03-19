package Recap;

import java.time.Year;

public class RecapIfStatements2 {

    public static void main(String[] args) {

        int year = 2000;
        boolean leapYear = true;

        if (year % 4 == 0) {

            leapYear = true;
            System.out.println(year + " Year is a leap year");

        } else {

            leapYear = false;
            System.out.println(year + " year is not a leap year");

        }

    }
}
