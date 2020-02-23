package day61;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {

    public static void main(String[] args) {

        List<String> lst = new LinkedList<>(Arrays.asList("Zeynep","Ershat","Kamira","Sabira"));

        System.out.println("lst = " + lst);

        lst.remove("Ershat");
        System.out.println("lst = " + lst);

    }
}
