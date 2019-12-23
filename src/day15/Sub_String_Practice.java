package day15;

public class Sub_String_Practice {

    public static void main(String[] args) {

       // getting the part of the String out of another String


       String movie = "Lord of The Ring ";

       // I want to get the String of out <of> from this movie

        String wordOf = movie.substring(5,7);

        System.out.println("wordOf = " + wordOf);

        // Sub string will return part of another string
        // starting from beginning index until right before ending index

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);

        // Get the second word !


        int startingPoint = movie.indexOf(" ") +1;
        int endingPoint = movie.length() ;

        System.out.println("second word till last :" + movie.substring(startingPoint,endingPoint));

        // assume we already know the location of starting point of second word
        // and the ending of the sentence

        String secondTillLast = movie.substring(5,16);

        System.out.println(secondTillLast); // easier approach

        String lordOf = movie.substring(0,7);

        System.out.println(lordOf);

        // If you want to start from somewhere and just get the rest of the string
        // above method will work, however there is even better method
        // if you provide only one parameter to substring method
        // it will just start from that location and get till the end

        String secondToLast = movie.substring(5) ; // of


           // Turn lord of the ring to Ring of the lord

            String ring = movie.substring(12,16);

            String ofThe = movie.substring(5,11);

           String lord = movie.substring(0,4);

           String java = "Java ";

            System.out.println(ring + " "+ ofThe + " " + java + lord);

    }



}
