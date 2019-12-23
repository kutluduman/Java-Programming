package day23;

public class StringArray {


    public static void main(String[] args) {

    String[] shows = {"Orville", "Gifted", "Game of Thrones", "Flash", "Arrow", "Super girl"};

        int showsCount = shows.length;

        System.out.println("showsCount = " + showsCount);


        for (int x = 0; x <=showsCount-1 ; x++) {

           String currentShow  = shows[x];

            System.out.println(currentShow + " has character count " + currentShow.length());

        }




    }
}
