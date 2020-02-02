package office_Hour;

public class Practice_01_16 {

    public static void main(String[] args) {

        /**
         * Encapsulation: Data hiding
         *
         *      Access Modifiers; public, default, private, protected
         *
         *      private : visible or accessible only within the same class
         *
         *      1. Data you are hiding should not be visible to other classes. So data should have private
         *         access modifier
         *      2. grants other classes get access to the private data through getter/setter methods.
         *
         *          you cannot make getter/setter private, it would be logical error. they should be declared as
         *          public
         *
         *    Attributes ---> instance variables. Inside the class, outside any methods & blocks.
         *                      belong to the object
         *                      each object they have their own copy of instance variable
         *
         *    Local variable ----> inside the method or blocks
         *
         *    Creating object ----> ClassName referenceName =new ExistingConstructor;
         *                          object should be created with existing constructor
         *
         *    Constructor ----> every class must have. if we dont create constructor, the compiler creates for us
         *                      default constructor
         *
         *                      Gets executes as soon as we create the object of the class
         *
         *                      Declaration : access modifier className(parameter if needed){
         *                                      statement;
         *
         *                      }
         *
         *
         *    getter ----> instance method, returns of the private data
         *
         *    setter -----> modifies. instance method, does not return anything. return type must be void
         *                  passes a parameter. the data type of parameter should match with the data type
         *                  you are passing from private
         *
         *    this ----> refers to object instance
         *                  this. ----> used to call instance variable and instance methods
         *
         *             There should be no static method to call this or it gives compiler error
         *
         *              if the local variable has same variable name with instance variable, then we can use
         *              this keyword to call instance
         */

    }

}
