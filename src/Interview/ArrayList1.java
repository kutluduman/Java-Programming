package Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {

        // remove name :

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "Eric", "John", "Ahmed"));


        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).contains("Ahmed")) {

                names.remove(i);

            }

        }

        System.out.println(names);


        // or :

        ArrayList<String> name = new ArrayList<>(Arrays.asList("Kemal", "Eric", "John", "Kemal"));


        name.removeAll(Arrays.asList("Kemal"));

        System.out.println(name);


    }

}

