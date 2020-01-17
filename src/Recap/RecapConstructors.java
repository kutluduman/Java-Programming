package Recap;

public class RecapConstructors {

    /**
     * Special method, it is used for creating object of a class
     *
     * Every class must have constructor
     *
     * Because if you do not create constructor, by default compiler create for you
     *
     * Creating Object ---> ClassName obj = new existingConstructor();
     *
     *
     * declaration of constructor(default) ----> access-modifier className(){
     *
     *
     * }
     *
     * constructor should have class name
     *
     * we can create multiple constructors by overloading
     *
     * There is no return type for Constructors
     *
     * When you pass the object only given constructor is printed
     *
     * Constructor with argument : you just pass parameter
     *
     * You cannot call constructor anywhere else, you can only call at constructor. only a constructor can call another
     * constructor
     *
     * Constructor cannot be called by constructor name
     *
     * we use "this()" keyword to call the constructor in current class
     *
     */


    public RecapConstructors() {

        System.out.println("default constructor");

    }


    public RecapConstructors(int a){

        System.out.println("Constructor with argument int: " +a);


    }



    public static void main(String[] args) {


        RecapConstructors obj = new RecapConstructors();
        RecapConstructors obj2 = new RecapConstructors(2);




    }


}
