package day09;

public class DayPrinter {

    public static void main(String[] args) {


        int dayCode = 5;

        if ( dayCode == 1) {

            System.out.println("It's a Monday");
        } else if ( dayCode == 2) {

            System.out.println("Its a Tuesday");

        } else if ( dayCode == 3) {

            System.out.println("Its a Wednesday");
        }else if ( dayCode ==4 ) {

            System.out.println("Its a Thursday");
        } else if ( dayCode == 5) {

            System.out.println("Its a Friday");
        } else if ( dayCode == 6 ) {

            System.out.println("Its a Saturday");
        } else if ( dayCode == 7) {

            System.out.println("Its a Sunday");
        } else {

            System.out.println("There isn't such a day!");
        }


    }
}
