package day49;


// Can a class both extend another class and implement a interface ----> Yes
public class IceCream extends Object implements Edible {


    @Override

    public void eat() {

        System.out.println("eat with spoon");

    }

    @Override

    public void drink() {

        System.out.println("Drink if it is melted");


    }

    @Override

    public void digest(){

        System.out.println("Digesting burger by chewing more");

    }


    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();

        // since Object class exists, we can create object out of it

        //       Object o1 = new Object();

    }

}
