package repl_it;

import java.util.Scanner;

public class OnlineBookMerchants {

    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer== true) {

            if (nbooksPurchased>= 5 && nbooksPurchased<8) {

                nbooksPurchased =  1 ;



            } else if (nbooksPurchased>=8 ) {

                nbooksPurchased=  2 ;
            }



        } if (isPremiumCustomer==false) {


           if (nbooksPurchased<7) {


              nbooksPurchased= 0;


         }  else if (nbooksPurchased>= 7 && nbooksPurchased<12) {

                nbooksPurchased=1 ;

            } else if (nbooksPurchased>=12) {

                nbooksPurchased=2 ;

            }

        }


        System.out.println(nbooksPurchased);



    }


}
