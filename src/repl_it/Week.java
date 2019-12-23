package repl_it;

import java.util.Scanner;

public class Week {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

     if (day == 1){ System.out.println("Its a Monday");}
       else if (day == 2){ System.out.println("Its a Tuesday");}
        else if (day == 3){ System.out.println("Its a Wednesday");}
        else if (day == 4){ System.out.println("Its a Thursday");}
        else if (day == 5){ System.out.println("Its a Friday");}
        else if (day == 6){ System.out.println("Its a Saturday");}
        else if (day == 7){ System.out.println("Its a Sunday");}
        else {
            System.out.println("There is no such a day");}
    }
}
