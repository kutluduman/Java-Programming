package day16;

public class IndexOf_With_Two_Parameter {

    public static void main(String[] args) {



        String name = "I love Java I love Java Java Java" ;
        
        // get the second java from the sentence
        // assume you already know there is 4 Java in the sentence
        // Second Java means, the Java showed up first Java
        
        
        // first find out where is the first java showed up. Where is the location of first Java
        // in order to find second one , instead of searching beginning, search from 
        // right after you the location you found first Java
        // then it will give you the index of second java
        // How do I start from different location when using index of
        // because it starts from beginning


        // indexOf method has 2 version, 1 expect 1 external data
        // the other one expect 2 external data
        
        int firstJava = name.indexOf("Java");
        System.out.println("firstJava = " + firstJava);

        int secondJava = name.indexOf("Java", 8);
        System.out.println("secondJava = " + secondJava);

        int thirdJava = name.indexOf("Java", 20);
        System.out.println("thirdJava = " + thirdJava);

        int fourthJava = name.indexOf("Java", 25);
        System.out.println("fourthJava = " + fourthJava);


        // how do I start from the location that get past first Java
        // basically starting point different then 0 so that it get past first Java
        
        int firstJavaLocation = name.indexOf("Java");
        System.out.println("firstJavaLocation = " + firstJavaLocation);

        // starting point can be right after the index of first character of the word
        // or you can start here + 4
        // or you can start right after you finish the word you are searching, for the word java + 4
        // if we do not know the length of the word ----> word.length


        int startingPointToSearchSecondJava = name.indexOf("Java", firstJavaLocation+1);
        System.out.println("startingPointToSearchSecondJava = " + startingPointToSearchSecondJava);


        int searchForLove = name.indexOf("love", 7);
        System.out.println("searchForLove = " + searchForLove);
        
        
        String love = name.substring(searchForLove, searchForLove+4);
        System.out.println("love = " + love);


        // find the second word
        
        int firstSpace = name.indexOf(" ");
        System.out.println("firstSpace = " + firstSpace);

        int searchForSpace = name.indexOf(" ", firstSpace+1); // plus 1 because of the space, you search
                                                                            // after the space
        System.out.println("searchForSpace = " + searchForSpace);

        String secondword = name.substring(firstSpace,searchForSpace);
        System.out.println("word = " + secondword);

    }
}
