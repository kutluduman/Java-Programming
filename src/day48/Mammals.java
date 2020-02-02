package day48;

// Mammal is extending Abstract super class animal
// and yet Mammal is another Abstract class itself

public abstract class Mammals extends Animal {


    // if the sub class of abstract super class is also abstract
// you are not required to provide boy for abstract method
    // because abstract class can have abstract method
    // you can optionally provide body


    public abstract void drinkMilk();


}
