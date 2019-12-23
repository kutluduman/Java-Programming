package day18;

import java.util.Scanner;

public class GiveMe5$20$ {

    public static void main(String[] args) {

        // Keep asking for 5$ or 20$ until you get them

        Scanner scan = new Scanner(System.in);
        System.out.println(" give me 5 or 20!!");

        int x = scan.nextInt() ;


        if (!(x==5 || x== 20)) { // or (x!=5 && x!= 20)


            System.out.println("Not the bill I am looking for");
            System.out.println("Give me 5 or 20");
            x=scan.nextInt();

        }


        System.out.println("THE HAPPY ENDING ! ");








    }

}
