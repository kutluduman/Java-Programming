package day44;

public class Notes {

    /**
     * Class ==== blueprint for an object
     *
     * attributes of object
     *          instance fields
     *
     * Behavior of object
     *      instance methods
     *
     *  Constructor :
     *
     *          a special block of code that run while object is being created
     *          it has same as class name
     *          no return type
     *          It can be overloaded
     *
     *   Static members : should be accessed in Static way!!
     *
     *              static method: a method with static keyword
     *                              can be called in static way
     *                              call directly in main (if in same class)
     *                              ClassName.staticMethod(...)
     *
     *                  Ex: Arrays.toString(arrObject)
     *                      Pet.showGeneralPetInfo();
     *
     *
     *
     *              static field :
     *
     *
     *
     * =============================
     *
     *
     *          Once when you create a class, it can be a type for :
     *
     *          ==== reference variable
     *               Pet mypet;
     *
     *          ==== it can show up in couple places  :
     *                  local variable : variable inside your method
     *                  method parameter data type:
     *                  field : outside method , under the class
     *
     *              it can also be a return type for your method
     *
     *=============================
     *
     *              Constructor vs Setters:
     *
     *   Constructor :
     *                  good when you want to create object with initial state(attribute values given)
     *
     *   Setter:
     *                  good when you want to change the value of existing object fields
     *
     * =============================
     *
     *        How to create a class that generate only immutable objects:
     *
     *                  Create a class with private instance field
     *                  add a constructor to set the value while object is being created
     *                  only provide getters for private fields
     *                  but do not provide setters for private fields
     *
     *          public class Person{
     *
     *              private String name ;
     *              private int age ;
     *
     *              public Person(String name, int age){
     *
     *                  this.name=name;
     *                  this.age=age;
     *
     *
     *              }
     *
     *              public String getName(){
     *
     *                  return name;
     *
     *              }
     *
     *              public int getAge(){
     *
     *                  return age;
     *
     *              }
     *
     *          }
     *
     *=============================
     *
     *  Person p1 = new Person("Jon Snow", 27);
     *
     *  Any data type that is not primitive type is called reference type
     *          any reference variable store :
     *                                              reference to the object in the heap
     *                                              address of the object in the heap
     *                                              just like leash of the dog
     *                                              just like remote of the tv
     *
     *
     *     by its type
     *                      primitive | reference variable
     *
     *    by its location
     *
     * 	                local variable
     *              	method parameter
     * 	                field
     *
     *
     *     =============================
     *
     *     Access modifier completed
     *
     *     public ---> accessible everywhere
     *
     *     protected ---> same package ----> accessible
     *                  different package ---> inside sub class accessible
     *                  only place it cannot be reached is
     *                  when it is different package and not
     *                  sub class
     *
     *
     *     default ---> no access modifier
     *                  only within the package, also known as
     *                  package private
     *
     *      private ---> only accessible within the same class
     *
     *
     * private ----> default -----> protected -----> public
     *
     *
     */



}
