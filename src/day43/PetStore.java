package day43;

import java.util.Arrays;
import java.util.List;

public class PetStore {

    public static void main(String[] args) {

        Pet p1 = new Pet("horse", "Walter");
        Pet p2 = new Pet("cat", "Samantha");
        Pet p3 = new Pet("dog", "Oliver");
        Pet p4 = new Pet("dog", "Henry");
        Pet p5 = new Pet("cow", "Adam");
        Pet p6 = new Pet("ant", "Atom");
        Pet p7 = new Pet("bear", "Teddy");
        Pet p8 = new Pet("cat", "Stephanie");


        List<Pet> myPets = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        System.out.println("myPets = " + myPets);


        for (Pet eachPets : myPets) {

            System.out.println("eachPets = " + eachPets.getName());


        }

        for (Pet eachPets : myPets) {

            if (eachPets.getType().equalsIgnoreCase("cat")) {

                System.out.println(eachPets);

            }

        }


    }
}
