package day19;

public class StringQuestion {

    public static void main(String[] args) {

        // given a string with value
        // find out how many a showed in this String

        String name = "Esra Fidan";
        
        int counter = 0 ;

        for (int x = 0 ; x < name.length() ; x++ ) {


            System.out.println(name.charAt(x));

            if (name.charAt(x) == 'a') {

                System.out.println("Bingo");
                counter++;

            }



        }


        System.out.println("counter = " + counter);







    }
}
