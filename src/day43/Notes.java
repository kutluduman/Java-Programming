package day43;

public class Notes {

    /**
     *
     *          Constructor Review
     *
     *      public Integer (int num){              <-------------  Integer i1 = new Integer (12);
     *
     *
     *      }
     *
     *
     *  public Integer(String num){
     *
     *                                              <-------------  Integer i1 = new Integer("12");
     *
     *
     *  }
     *
     *                  This Integer class has two constructors
     *
     *
     *  Constructor is a block of code that run when object is being created
     *      It has same name as class name
     *      and has no return type
     *      it can be overloaded
     *
     *   Most use case of Constructor is to provide initial state (Attribute values)
     *      for the object while being created
     *
     *      public Coffee{
     *
     *        private String type;
     *        private int caffeineLevel;
     *        private double price;
     *
     * }
     *          You create getters and setters in order to reach the private fields
     *
     *          no argument constructor:
     *
     *      public Coffee(){
     *
     *          sout"no arg constructor"
     *
     *      }
     *
     *      two argument constructor :
     *
     *      public Coffee(String type, int level){
     *
     *      this.type=type;
     *      caffeineLevel=level;
     *
     *
     *
     *      }
     *
     *
     *
     *  Any non primitive type can be addressed to null
     *
     *      null means the reference point is nothing
     *       no address written down
     *
     *
     *   Method Review : the 3 categories
     *
     *          Parameter: method that has parameter or does not have parameter
     *
     *          return type : void method or method with return type
     *
     *          need an object to be called?
     *          static method
     *          instance method
     *
     *
     * Every time you create a class, it will be type
     *          Movie, Coffee, Car , Bike, TV, Person
     *
     *
     *  Can be a data type
     *
     *      What can you do with the data type ???
     *
     *    You can create object out of it ===
     *              in the meantime , it can be your variable data type
     *
     *    How many places we used data type other creating object
     *
     *    you used it for local variable data type
     *
     *    TV t1 = a tv object ;
     *
     *    it can be used for method parameter just like String
     *    public static void printString(String str) {}
     *
     *    public static void repairTVparts(TV yourTVobj){}
     *
     *    public static String giveMeYourName() {return "Java";}
     *
     *    public static TV giveMeYourTV() {
     *
     *        return new Tv();
     *
     *    }
     *
     *    // where else did we see variable?
     *    public class Engine{
     *
     *
     *    }
     *
     *
     *    public class Car{
     *
     *        String make;
     *
     *        Engine e ; ---> class engine can be data type and variable
     *
     *
     *    }
     *
     *   String[] myArray;
     *   Car[] myCars;
     *   List<Car> myCarsLst ;
     *
     *
     *
     */




}
