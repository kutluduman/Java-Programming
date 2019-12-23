package day22;

public class ArrayLoops {

    public static void main(String[] args) {


        int [] score = new int[4];

        score[0]= 95 ;
        score[1]= 70 ;
        score[2]= 88 ;
        score[3]= 100 ;


//        System.out.println(  score[0]  );
//        System.out.println(  score[1]  );
//        System.out.println(  score[2]  );
//        System.out.println(  score[3]  );


//        how do we get the size of any array object
//        array object has a property called length

        int itemCount = score.length ;

        for (int x = itemCount-1; x >= 0 ; x--) {       // Reversing the array numbers

            System.out.println(score[x]);

        }



//        for (int x = 0; x <= itemCount-1 ; x++) {
//
//            System.out.println(score[x]);
//
//        }







 //      how do we get the char count of a String

        String name = "Jon Snow";
        int charCount = name.length();


    }
}
