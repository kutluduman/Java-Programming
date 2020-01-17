package office_Hour;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Practice_01_08_2 {

    public static void main(String[] args) {


        System.out.println(nameCharsToList("Sumeyye"));

        List<Character> result = nameCharsToList("Muge");

        System.out.println(result);


    }

    /**
     * a method that accept String object and turn it into List<Character>
     *
     * @param name
     * @return List<Character> that contains each character.
     */

    public static List<Character> nameCharsToList(String name) {


        List<Character> charLst = new ArrayList<>();


        for (int i = 0; i < name.length(); i++) {

            charLst.add(name.charAt(i));


        }


        return charLst;


    }

}
