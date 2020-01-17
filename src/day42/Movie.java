package day42;

public class Movie {

    private String name;
    double length;
    String genre;

    // default constructor :
    // a constructor that give by compiler
    // only if you don't have any in your  class
    // it's invisible
    // and it has no parameter
    // it has no code inside

    // Write a constructor to set all the fields value

    public Movie(String name, double length, String genre) {

        this.name = name;
        this.length = length;
        this.genre = genre;


    }

    public String getName() {

        return this.name;


    }


    public String toString() {


        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
