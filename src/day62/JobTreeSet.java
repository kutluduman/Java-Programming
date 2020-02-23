package day62;

import day61.Job;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

    // Create a SortedSet of Job(from day 61) with TreeSet implementation
        // add 5 jobs and print them out vertically and see what you get

        SortedSet<Job> jobs = new TreeSet<>();
        jobs.add(new Job("FL",120000,"AT&T"));
        jobs.add(new Job("LA",130000,"BBC"));
        jobs.add(new Job("TX",150000,"APPLE"));
        jobs.add(new Job("CA",100000,"AMAZON"));
        jobs.add(new Job("VA",100000,"USPTO"));

 //       System.out.println("jobs = " + jobs);
        
        for (Job each : jobs) {

            System.out.println("each = " + each);
        }




    }
}
