package day43;

// this class has a lot of static methods to deal with movie object
// this class does not serve as template for creating object
// just like arrays class does not serve as template for creating array object

import day42.Movie;

public class MovieActions {

    public static void printShorterDurationMovieName(Movie movieobj1, Movie movieobj2) {


        if (movieobj1.getLength() < movieobj2.getLength()) {

            System.out.println(movieobj1.getName());

        } else {

            System.out.println(movieobj2.getName());
        }


    }


    public static void main(String[] args) {


        Movie m1 = new Movie("Joker", 2.5, "Drama");
        printMovieInformation(m1);


        Movie m2 = new Movie("Cinderella", 1.5, "Family");
        printMovieInformation(m2);


        printShorterDurationMovieName(m1, m2);

        //      Integer i = Integer.valueOf(12);

        Movie result = getJokerMovieObject();

        System.out.println(result.getName());


    }

    // create a static method that return Joker movie object with 2.5 hour and type drama

    public static Movie getJokerMovieObject() {

        Movie j = new Movie("Joker", 2.5, "Drama");

        return j;

    }


    public static void printMovieInformation(Movie movieObj) {


        System.out.println("The movie name is " + movieObj.getName());
        System.out.println("Length is " + movieObj.getLength() + " hour long");
        System.out.println(" and the genre is " + movieObj.getGenre());


    }


}
