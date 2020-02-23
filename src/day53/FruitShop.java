package day53;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitShop {

    // Only Reference type decide what you can access at compile time
    // if we have Fruit as reference type, getDigested method will point to the one under Fruit Class
    // Actual Object type decide


    public static void main(String[] args) {


        Apple a1 = new Apple("Sweet", "Red", "Fuji Apple");

        // What can I access using reference variable a1?
        // a1 has Apple as reference type, so we can access anything inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        a1.getDigested();

        System.out.println("===============================================");


        Fruit f1 = a1; // Fruit is reference type, Apple is actual object type
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
//        f1.type we cannot access type coming from apple if we refer it as Fruit

        f1.getDigested();
        // if Fruit wouldn't have getDigested method
        // it won't compile
        // because only reference type decide what you can access


        Fruit f2 = new Apple("Crispy but tasteless", "hot red", "Gala");

        Fruit f3 = new Orange("Sour", "Orange", 12);

        Fruit f4 = new Orange("Very Sweet", "Blood Red", 10);

        Fruit[] myFruits = {f1, f2, f3, f4};

        for (Fruit eachFruit : myFruits) {

            eachFruit.getDigested();
            System.out.println("===================");

        }

        ArrayList<Fruit> listFruit = new ArrayList<>();
        listFruit.addAll(Arrays.asList(f1, f2, f3, f4));

        for (Fruit listEach : listFruit) {

            System.out.println("listEach = " + listEach.toString());
            System.out.println("listEach.getClass().getSimpleName() = " + listEach.getClass().getSimpleName());
            System.out.println("=======================");

        }


    }
}
