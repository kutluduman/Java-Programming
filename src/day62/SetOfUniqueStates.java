package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates {

    public static void main(String[] args) {


        Set<String> states = new HashSet<>();

        states.addAll(Arrays.asList("GA","NY","FL","CA","NY","WA","VA","VA","FL","FL"));

        System.out.println("states.size() = " + states.size());
        
        for (String each : states){

            System.out.println("each = " + each);
            
        }

        Iterator<String> stIter = states.iterator();
        
        while (stIter.hasNext()) {

            System.out.println("stIter.next() = " + stIter.next());
            
        }
        
        states.forEach(each-> System.out.println("each = " + each));
 

    }
}
