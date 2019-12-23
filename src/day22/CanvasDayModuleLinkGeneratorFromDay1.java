package day22;

public class CanvasDayModuleLinkGeneratorFromDay1 {

    public static void main(String[] args) {

//        Here is the direct links to lead you to correct days
//        https://learn.cybertekschool.com/courses/278/modules#3317
//        this will lead you to day 21
//        https://learn.cybertekschool.com/courses/278/modules#3318
//        this will lead you to day 22
//        https://learn.cybertekschool.com/courses/278/modules#3319
//        this will lead you to day 23
//        https://learn.cybertekschool.com/courses/278/modules#3320
//        this will lead you to day 24
//        and so on
//
//        So write a program to generate the links to
//        lead you to the right module of the day from day 21 all the way till day 56 (edited)
//


        // only day and module is changing : always check the sequential order


        String baseUrl = "https://learn.cybertekschool.com/courses/278/modules#";
        String dayText = "This will lead you to day";

        //     System.out.println(3317 - 21); // this would be the starting day module number


  //      for (int moduleNumber = 3317; moduleNumber <=3317+35 ; moduleNumber++) { // 56-21 = 35




  //      }





        for (int day = 1; day <=22 ; day++) {

            System.out.println(dayText +" " + day);


 //         Day 1 module ID is 3297

            System.out.println(baseUrl +" "+ (day + 3296 )); // 3317-21 the first day module


        }











    }

}
