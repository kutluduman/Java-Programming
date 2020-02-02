package day48;

// a class can implement more than one interface
public class Kangaroo implements Bouncible, BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {

        this.name = name;
        this.jumpDistance = jumpDistance;


    }

    // this method is overridden from Bouncible interface
    public void bounce() {

        System.out.println("Kangaroo is bouncing");

    }

    public void eat() {

        System.out.println("Kangaroo is eating");

    }

    // these two methods, are overridden from BoxerWithBellyPouch interface

    public void kickBox() {

        System.out.println("Kangaroo is kickboxing");

    }

    public void carryChildInThePocket() {

        System.out.println("Kangaroo carries the child in the pocket");

    }


    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
