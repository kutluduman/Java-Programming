package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        // 1, write a program to test all the element in an int array more that 100
        // 2, write a program to print count of certain item in an array.
       // if item does not exists it should print 0 , if not print the count of the item
        // 3 , given a String with multiple word. get an array of words then reverse the array
        // 4 , OPTIONAL : reverse each word in a sentence after getting an array of words


        int[] scores = {156,101,76,187,87,110};
        int count = 0 ;

       for (int each : scores ) {



           if (each<100) {

               System.out.println("each = " + each);
               
               count++;
           }


       }

        System.out.println("count = " + count);
       
       if (count>0) {


           System.out.println("Answer is No");

       }

        




    }
}
