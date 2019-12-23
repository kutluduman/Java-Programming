package office_Hour;

public class Practice_12_05 {

    public static void main(String[] args) {


        int a = 9;

        while (a > 8) {       // when its if, it only prints once but when its while, it prints infinite times


            System.out.println("Hello Batch 15");

            a-- ;  //a1 will become 8 after first Hello Batch, because it is a post decrement

                    // as the loop gets fall, it just prints once and gets out, it prints once because of post decrement

        }

        System.out.println("=========================================================");


        for (int x = 9; x>1; --x) {

            System.out.println("Hello Batch 15");

        }

        System.out.println("=========================================================");

        // Task 10 -20

        for (int x = 10 ; x<=20; ) {



            System.out.println(x);   // ------> you can put iterator here too
            x++;



        }


        System.out.println("=========================================================");


        // convert loop to while;


        int x= 10;

        while (x<=20) {

            System.out.println(x);
            ++x;

        }

        System.out.println("=========================================================");

        int z = 10;

        do{

            System.out.println(z);
            ++z;

        }while (z<=20);




    }
}


