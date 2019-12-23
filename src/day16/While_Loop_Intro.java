package day16;

public class While_Loop_Intro {

    public static void main(String[] args) {

        // print hello world 5 times
        // also keep the count of how many times you said hello

   int count = 1;

        System.out.println("Hello World");
        // count = count + 1;
        // count += 1 ;

        // this is the path doing repetition without loop :

//        ++count;
//
//        System.out.println("Hello World");
//
//        ++count;
//
//        System.out.println("Hello World");
//
//        ++count;
//
//        System.out.println("Hello World");
//
//        ++count;
//
//        System.out.println("Hello World");
//
//        System.out.println("Count is " +count);


        // this is the loop version

        int countLoop = 1;

        while (countLoop <= 5) {

            System.out.println("Hello World");
            System.out.println(" cnt value is " + countLoop);

            countLoop++;

        }








    }
}
