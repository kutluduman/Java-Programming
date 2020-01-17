package day35;

public class SumInsideAStr {

    public static void main(String[] args) {

        /**
         *  Additionally, Get the sum of the numbers inside a String
         *  optionally make it a method
         */


        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();

        int sum = 0;

        for (char each : allChars) {

            //           System.out.println("each = " + each);


            // checking whether each char is a number or not
            if (Character.isDigit(each)) {

                // if it is, print out to see
                System.out.println("each = " + each);

                // then turn it into int using parseInt method
                //parseInt only accepts String
                //so we add empty String to convert to Char to String
                int eachNum = Integer.parseInt(each + "");

                // now we can numerically add the number to the sum
                sum += eachNum;
            }

        }

        System.out.println("sum = " + sum);

    }
}
