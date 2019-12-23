package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {


        String students = "Abbos, Zulyar, Zhibek, Hasan, Muge, Orhan, Susan";

       students = students.replace(" ", "");

        System.out.println("students = " + students);

        System.out.println();

        // first get all the name into String array called namesArray

        // Spell the name of each person in this format
        //A-b-b-o-s-

        // optionally count 'a' from each and print

        String[] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));

        System.out.println();

        System.out.println("Length of namesArrays1 is " + namesArrays.length);



        System.out.println();
        int studentCount = namesArrays.length;






        for (int x = 0 ; x<studentCount ; x++) {

            String name = namesArrays[x];
            System.out.println("Spelling = " + name);


            for (int i = 0; i <name.length() ; i++) {

                System.out.print(name.charAt(i)+ "-");

            }

            System.out.println();


        }









//        System.out.println();
//
//        String name1 = namesArrays[1];
//
//        for (int x = 0; x <name1.length() ; x++) {
//
//            System.out.print(name1.charAt(x)+"-");
//
//        }
//
//
//
//        System.out.println();
//
//        String name2 = namesArrays[2];
//
//        for (int x = 0; x <name2.length() ; x++) {
//
//            System.out.print(name2.charAt(x)+"-");
//
//        }
//
//
//
//
//


    }
}
