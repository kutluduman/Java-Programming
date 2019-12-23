package day26;

import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {


        String name1 = "Emma";
        String name2 = "Jason";
        
        //name2 should have Emma, name1 should have Jason
        
        


        String tempContainer = name1; //we store somewhere so that it does not get lost

        name1 = name2;
        name2 = tempContainer;

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println();

        // swap the value of first item and last item

        int[] myNumbers = new int[] {10,40,30,7};

        int temp = myNumbers[0];

        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;

        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[3]);

        System.out.println(Arrays.toString(myNumbers));



    }
}
