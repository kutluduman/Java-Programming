package office_Hour;

import java.util.Arrays;

public class Practice_12_10_2 {

    public static void main(String[] args) {

        int[] ages = {23,43,5,7,87};

        System.out.println(ages[2]);


        // I want to show the output of 2

        System.out.println();

        System.out.println(ages[3]-ages[2]); // 7-5 = 2

        System.out.println();



        for (int agesOfStudents : ages) {

            System.out.println("This student's age is  " + agesOfStudents);
            System.out.println("I am done");
            
            
        }

        System.out.println();


        // without loop:

        System.out.println(Arrays.toString(ages));


    }
}


