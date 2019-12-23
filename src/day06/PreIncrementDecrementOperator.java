package day06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {

        //initializing(giving value) offerCount value to 2

        int offerCount = 2;

        //offerCount = offerCount + 1; -------- increasing the number by 1 in normal way
        //offerCount +=1;

        // There is even more
        // Since increasing or decreasing a value is very special
        // and often used in programming
        //There is even shorter shortcut for this operation
        // and we use ++ or --, this is exclusively for increasing or decreasing by 1
        // we can use it for any other type

        ++ offerCount;

        System.out.println("Offer now " + offerCount);




    }

}
