package office_Hour.Practice_02_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Kentucky obj1 = new Kentucky();
        obj1.KFC();
        obj1.tax();

        States obj2 = new Kentucky();
        obj2.tax();
        //       obj2.KFC(); you cannot call because reference type decides what can be called


        States obj3 = new California();
        obj3.tax(); // will give the overridden one
        obj3.method1();

        List<Kentucky> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky()));

        String name1 = list.get(0).stateName;

        System.out.println(name1);

        States[] arr = {new Kentucky(), new California()};

        // Kentucky obj4 = new States(); ----> sub class cannot be reference


    }


}


interface A {


}

class B implements A {

    public static void main(String[] args) {

        A obj = new B(); // super-type can be reference to child class class object
    }


}