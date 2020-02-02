package day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {


        Person p1 = new Person("Kevin", 31);

        Person p2 = new Person("Arafat", 30);

        Person p3 = new Person("Asena", 18);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        // compare p1 and p2 by age
        // if p1 is older print 1
        // if they are same age print 0
        // if p2 is older print -1

        // can we just directly provide Person Object new keyword
        int result = p2.compareTo(new Person("Jon Snow", 27));
        System.out.println("result = " + result);

        System.out.println(p1.compareTo(p2));

        System.out.println(p2.compareTo(p3));

        // print out the name of older person between p2 and p3
        // it's asked to use comparedTo method we just created
        if (p1.compareTo(p3) == 1) {

            System.out.println(p3.name);
        } else {

            System.out.println(p1.name);
        }

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);


        System.out.println(lst);


        // Anything we sort must be a type of comparable

        Collections.sort(lst); // gives error because according what we sort --> this is our own class
        // now does not give error because we made compare to Method

        System.out.println("lst = " + lst);

    }

}
