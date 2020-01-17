package day37;

import java.util.ArrayList;

public class ArrayListFindLongest {

    public static void main(String[] args) {

        /**
         * find longest name
         */


        ArrayList<String> name = new ArrayList<>();

        name.add("Qalbinur");
        name.add("Ruzi");
        name.add("Sabahiddin");
        name.add("Guzelnurin");
        name.add("Guzelnur");
        name.add("Muyesser");
        name.add("Mustafa");

        System.out.println("name = " + name);


        String longestName = name.get(0);

        for (int x = 0; x < name.size(); x++) {

            if (name.get(x).length() > longestName.length()) {

                longestName = name.get(x);


            }


        }

        System.out.println("longestName = " + longestName);


        // length : counting elements inside array, it's property of array object
        // last item of array : arr[arr.length-1]
        // length(): counting the characters inside String, it's a method of String object
        // last char of a String : str.charAt(str.length-1)
        // size() : counting the elements inside ArrayList object
        // last element of ArrayList: list.get(size-1)


        // > more will give you first longest name if you have more than one
        // >= more will give you last longest name if you have more than one


        // How do I get the concatenation of all longest words if there are more than one
        // first find out the longest word , and get the character count
        // then loop through each names
        // and check whether character count equal to longest word character count


        for (int x = 0; x < name.size(); x++) {

            if (name.get(x).length() == longestName.length()) {

                System.out.println("Al names that are long = " + name.get(x));


            }


        }

        // How do we use for each loop to go through each items

        for (String currentName : name) {

            System.out.println("currentName = " + currentName);
            
        }


    }
}
