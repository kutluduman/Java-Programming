package day49;

// you are building super-sub relationship, IS-A relationship
// a class can only extends one other class
// a class can implements multiple interfaces


public class Burger implements Edible, Juicy {

// public static final boolean IS_HUMAN_FOOD = true ; // we have this even though we do not see


//public Burger(){
//
//                          // we have this even though we do not see
//    super();
//}
//


    @Override

    public void eat() {

        System.out.println("Eating burger with big bite");

    }

    @Override

    public void drink() {

        System.out.println("Eat burger then drink soda");


    }

    @Override

    public void melt(){


    }


}
