package day16;

public class Second_Word_Getter {

    public static void main(String[] args) {

        // given a sentence with 3 words
        // get the second word


        // Steps:
        // second word is between first space and last space in this case

        // getting location of space reminds me of indexOf
        // getting string inside another string by beginning and ending index
        // substring

  //      String sentence = "I love Java";

        String sentence = "You understand Java";

        String secondWord ;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");

        System.out.println("lastSpaceIndex = " + lastSpaceIndex);


        System.out.println(sentence.substring(4,15)); // 2 comes from 1+1, because 1 shows the space location


        secondWord = sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println("second word = " + secondWord); // if you do not know the word


        // how to get the first word :
        // in plain english: first word is stating from first character till first space

        String firstWord = sentence.substring(0,firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);


        // how to get the last word :
        // in plain english: last space till the rest
        
        
        String lastWord = sentence.substring(lastSpaceIndex);
        System.out.println("lastWord = " + lastWord);


    }


}
