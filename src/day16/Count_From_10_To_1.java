package day16;

public class Count_From_10_To_1 {

    public static void main(String[] args) {


        // I want to start with 10 , then decrease the value by one
        // so I can get out of the loop


        int count = 10;

        while (count >= 1) {

            System.out.println(count);

            --count;
        }

        System.out.println(count); // it comes out of the loop but due to the increment it gets less


//              This is another method but the first method is much better in testing way
//
//        while (count != 0) {
//
//            System.out.println(count);
//
//            -- count;
//
//        }
//
//


    }


}
