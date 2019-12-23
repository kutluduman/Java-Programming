package day23;

public class WarmUp_Array {

    public static void main(String[] args) {
        //  create an int array of 7 items
        //  assign values
        // 1,  print out in reverse order
        // 2 , store last item in a variable called lastItem
        // print it out separately
        // 3 , print the item right in the middle
            //
            // OPTIONALLY : find sum , find average , find max , find min


        int[] num = new int[7];

        num[0]= 11 ;
        num[1]= 2 ;
        num[2]= 23 ;
        num[3]= 4 ;
        num[4]= 53 ;
        num[5]= 6 ;
        num[6]= 3 ;


        for (int x = num.length-1 ; x >=0 ; x--) {

            System.out.println("item = " + num[x]);
            
        }
        int arraySize = num.length;
        int lastItem = num.length-1;
        
        int lastItemValue = num[lastItem];

        System.out.println("lastItemValue = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("middleItemIndex = " + num[middleItemIndex]);

        int sum = 0;

        for (int x = 0; x <= lastItem ; x++) {

            System.out.println("current item = " + num[x]);
            int currentItem = num[x];
            sum= sum + currentItem;
            System.out.println("sum = " + sum);

        }
        

    }
}
