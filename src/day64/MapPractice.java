package day64;

import javax.naming.MalformedLinkException;
import java.util.*;

public class MapPractice {

    public static void main(String[] args) {


        // What if we want to have multiple value for one key
        // for example groupName -- group member names

        // key data type is String, value data type is List<String>
        Map<String, List<String>> groupMap = new HashMap<>();


        groupMap.put("PowerOf4", Arrays.asList("Furkan", "Daria", "Serife", "Muge"));
        groupMap.put("Achievers", Arrays.asList("Maia", "Anastasia", "Zaki", "Toyly", "Like"));
        groupMap.put("BugHunter", Arrays.asList("Ayse", "Rabiya", "Gulzina"));
        groupMap.put("BugBusters", Arrays.asList("Rukhsona", "Fariza", "Seyra", "Sumeyyra", "Huvayda"));

        System.out.println(groupMap);

        // get Toyly, he is at index 3
        System.out.println(groupMap.get("Achievers").get(3));

        // check whether this map has Gulzina or not in BugHunter ?

        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        // we want to add a group entry so we can add or remove members from the group

        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "Wonder Woman", "Spiderman")));

        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap = " + groupMap.get("Justice League"));

        // the key for the Map should be a type of  something immutable that's why no Array

    }
}
