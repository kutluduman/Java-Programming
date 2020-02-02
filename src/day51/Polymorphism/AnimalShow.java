package day51.Polymorphism;

public class AnimalShow {

    public static void main(String[] args) {

        // we are referring Dog object using Animal reference
        Animal a1 = new Dog(); // animal a1 is pointing out to Dog

        a1= new Horse(); // we reassigned it. it can only point to one

        // any variable can store one thing at a time

        a1.makeNoise();








    }

}
