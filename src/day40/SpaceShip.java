package day40;

public class SpaceShip {


    String name;
    int xCordinate;
    int yCordinate;
    String currentDirection;


    public void move1Block() {

        switch (currentDirection) {

            case "up":

                yCordinate++;

                break;

            case "down":

                yCordinate--;

                break;

            case "right":

                xCordinate++;

                break;

            case "left":

                xCordinate--;

                break;

            default:

                System.out.println("No change in position");


        }


    }

    public void setDirection(String direction) {

        currentDirection = direction;

    }


    public String toString() {

        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }

    public void setInitialPosition(int x, int y) {

        xCordinate = x;
        yCordinate = y;

    }

    public void move1Block(String newDirection) {

        setDirection(newDirection);
        move1Block();


    }

}


