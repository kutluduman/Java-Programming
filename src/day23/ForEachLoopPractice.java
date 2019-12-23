package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {

//                * create a long array or 5 items called salaries
//                * put your salary amounts that ok for your offer
//                *
//                * use for each loop to iterate over them
//                * and print them out
//                *
//                *
//                * OPTIONALLY : use different for each loop to
//                * print only the salary more than 100000
//                *
//                * */



        long[] salaries = {90000, 100000, 110000,120000, 130000};


        for (long eachSalary  :   salaries       ) {

            System.out.println("eachSalary = " + eachSalary);

        }

        System.out.println();

     for (long salary : salaries) {
         
         if (salary>100000) {

             System.out.println("salary = " + salary);
             
         }
         
         
     }




    }

}
