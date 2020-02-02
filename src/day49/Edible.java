package day49;

// interface is a contract
// once someone sign the contract, he/she will provide all the details that must be done

// An interface is not a class
public interface Edible {

    // In interface, fields are automatically public static final, if not defined so
    // public static final filled naming convention is ALL_CAPS!
    // You can have as many constants as you want


    public static final boolean IS_HUMAN_FOOD = true ;


    // If a method with no body is not defined as public abstract, it is automatically
    // public abstract

    public abstract void eat();

    public abstract void drink();


    // default method was added since java 8 to provide
    // default implementation to not break existing implementation
    // classes have option to use it as is
    // or override it according to their own requirements
    // the default method only exists in an INTERFACE
    // default keyword here is not an ACCESS MODIFIER!!!
    // a default method must have a body
    public default void digest(){

        System.out.println("You implement the code");

    }





}
