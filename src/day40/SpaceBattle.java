package day40;

public class SpaceBattle {

    /**
     * Create a class called SpaceShip
     * it has 4 attributes :
     * name as String
     * currentDirection as String  | up , down , right, left
     * xCordinate as int
     * yCordinate as int
     * few behaviours :
     * setInitialPosition
     * accept 2 int parameters
     * to provide initial posi  tion of spaceship
     * setDirection  void method
     * accept 1 String parameter to set the direction
     * move1Block    void method
     * accept no parameter
     * and change the position according to the direction
     * toString method
     * return String reperesntation of Spaceship Object
     *
     * @param args
     */

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();
        s1.name = "Orville";


//        s1.setInitialPosition(1, 5);
//        s1.setDirection("up");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);
//
//        // wrong direction, won't move
//        s1.setDirection("ABC");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);
//
//
//        s1.setDirection("down");
//        s1.move1Block();
//        System.out.println("s1 = " + s1);

        
        s1.move1Block("up");
        s1.move1Block("right");
        s1.move1Block("up");
        s1.move1Block("left");
        s1.move1Block("Home");

        System.out.println("s1 = " +  s1);

    }
}
