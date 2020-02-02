package day48;

public interface Bouncible {

    // if we don't add public static final for the field
    // all interface fields are automatically public static final
    // double gravity = 9.81;
    // this is exclusive feature of interface only


    public static final double gravity = 9.81;

        // every member of interface automatically is public
    // if no access modifier is given
    // all the method with no body automatically public abstract
    // void bounce();


    public abstract void bounce();


}
