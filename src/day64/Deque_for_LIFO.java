package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_for_LIFO {

    public static void main(String[] args) {

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review your class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to Java");

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());




    }
}
