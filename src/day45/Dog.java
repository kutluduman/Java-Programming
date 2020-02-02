package day45;

public class Dog extends Animal {

/*
    public void speak() {

        System.out.println("Dog Bark");


    }*/

    // why do we want to call super class version of overridden method
    // we want to build on top of what's already written
    // code reuse
    // parent provide step abc
    // child want to do abc defg
    // so instead of repeating abc
    // child can directly call super class version of the method
    // to perform abc then add defg

    @Override
    public void speak() {

        //super. can be used to specify we are calling
        // super class version of the method
        // can we use super. or this.. outside of instance method
        // BIG NO!
        super.speak();
        System.out.println("Bark!");
    }

    public static void main(String[] args) {


        Dog twix = new Dog();


        twix.speak();


    }

}
