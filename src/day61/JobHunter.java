package day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

        List<Job> lst = new LinkedList<>();
        lst.add(new Job("GA", 120000, "BOFA"));
        lst.add(new Job("VA", 110000, "AMAZON"));
        lst.add(new Job("NY", 140000, "APPLE"));
        lst.add(new Job("CA", 150000, "SAMSUNG"));
        lst.add(new Job("GA", 145000, "ADOBE"));

        Collections.sort(lst);
        // How does sort method know how to sort?
        // it uses the comparing logic provided inside
        // the compareTo(Job other) method
        // then sort them accordingly
        System.out.println("lst = " + lst);
        
        Collections.sort(lst,Comparator.reverseOrder());

        System.out.println("lst = " + lst);
        
//        Job j1 = new Job("GA", 120000, "BOFA");
 //       Job j2 = new Job("VA", 110000, "Amazon");

        

 //       System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));


        //  Collections.reverseOrder() will also give you an object with reversed comparing logic
        //  below code will try to sort the list in reverse order from natural order
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println("myFavJobs after 3 = " + lst);


        // what's the difference between Collections.reverseOrder()
        // and Comparator.reverseOrder()
        // both of them will give you an Comparator object with reversed logic
        // they are just at two different place
        // one is the static method of Comparator interface
        // another is static method of Collections class
        // no functional difference at all , they happen to have same name
    }
}
