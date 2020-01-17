package day35;

public class FloatWrapper {

    public static void main(String[] args) {

        /**
         * String sentence
         * 	 "I bought 3 tomato and the price was 3.14 each"
         *  How much is your final checkout price
         *  The count is always 3rd word
         *  The price is always at 2nd word from the last
         *
         *  logic = split by space parse count and price, do calculation
         */


        String sentence = "I bought 3 tomato and the price was 3.14 each";

        String[] allWords = sentence.split(" ");

        // int cont = Integer.parseInt(allWords[2]) ; parse return primitive
        // this will also give you same result
        // valueOf return an object then unboxing it and and save it into count

        int count = Integer.parseInt(allWords[2]);

        double price = Double.parseDouble(allWords[allWords.length - 2]);

        System.out.println("Total price = " + (count * price));


        // In one shot:
        System.out.println(Integer.parseInt(allWords[2]) * Double.parseDouble(allWords[allWords.length - 2]));

    }
}
