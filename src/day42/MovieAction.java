package day42;

public class MovieAction {


    public static void main(String[] args) {


        Movie m1 = new Movie("Interstellar", 3.15, "Drama&Space");


        System.out.println(m1.toString());


//        Movie m2 = new Movie();

//        System.out.println(m2.toString());


        System.out.println("m1.getName() = " + m1.getName());


    }
}
