package day23;

public class ForEachLoopPracticeFindMax {

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

        // I need to pick up an item from this array so I can compare with other items
        // since first one is right there, I just decide to pick it up
        // and make it temporarily the max value
        // can I pick 2nd or 3rd instead -----> yes you can

        long maxSalary = salaries[0];

        for ( long salary  : salaries  ) {
            
            if (salary>maxSalary) {
        
                maxSalary= salary;
                
            }
            
        }
        System.out.println("maxSalary = " + maxSalary);
    }

}
