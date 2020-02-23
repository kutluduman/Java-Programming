package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {


        Set<String> states = new HashSet<>();

        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL","FL","GA"));

        states.removeIf(each-> each.contains("A"));
        System.out.println("states = " + states);


//        states.remove("GA");
//        System.out.println("states = " + states);
//
        
//        states.removeAll(states);
//
//        System.out.println("states = " + states);

        // remove all the states with letter A

//        Iterator<String> stIter = states.iterator();
//
//        while (stIter.hasNext()) {
//
//            String each = stIter.next();
//            if (each.contains("A")) {
//
//                stIter.remove();
//            }
//        }
//        System.out.println("states = " + states);




    }
}
