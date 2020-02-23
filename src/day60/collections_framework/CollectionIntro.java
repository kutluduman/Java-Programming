package day60.collections_framework;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {


        //   List<String> names = new ArrayList<>();


        // List interface extends Collection interface
        // and ArrayList implements List interface
        // So we can safely say ArrayList IS-A collection
        Collection<String> names = new ArrayList<>();

        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set, Queue, List have in common

        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");


        names.addAll(names); // addAll method parameter type is Collection

        names.remove("Hasan"); // removes only one Hasan

        names.removeAll(Arrays.asList("Abdullo")); // removes all Abdullo

        System.out.println("names = " + names);

        //       System.out.println("first item " + names.get()); because Collection does not have index


        for (String eachName : names) {

            System.out.println("eachName = " + eachName);
            

        }
        
        names.forEach(each -> System.out.println("each = " + each));
        
        

    }

}
