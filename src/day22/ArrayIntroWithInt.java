package day22;

public class ArrayIntroWithInt {

    public static void main(String[] args) {

        // Syntax for creating variable and assigning value

        // dataType variableName = value here

        // with array : dataType[] variableName = value here


 //       int num1 = 10 ; assigning single value

        // syntax for creating variable to store multiple items
        // and assigning values
        // dataType [] variableName = new dataType[count of item ];

        int [] score = new int[4]; // we can store four item because array size is 4.

        score[0]= 95 ; // first item because index starts with zero
        score[1]= 70 ;
        score[2]= 88 ;
        score[3]= 100 ;



//      Accessing the elements inside array one by one
        System.out.println(  score[0]  ); // you access the first score
        System.out.println(  score[1]  );
        System.out.println(  score[2]  );
        System.out.println(  score[3]  );


//      updating the value at certain index

        score[1]= 99;

        System.out.println(score[1]);

        // Once array is created with certain size, we cannot change the size


        // you can just keep changing what you have inside the array


        // When you create new Array object
        // it will get default value in each element

        int [] numbers = new int[3];

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);         // as default you get 0
        System.out.println(numbers[2]);












    }
}
