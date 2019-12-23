package day24;

public class ShoppingWithArray {

        public static void main(String[] args) {


//        Create a String array of 6 items to store groceryItems
//        {"apple","banana","grape","strawberry","blueberry","kiwi"}
//        Create a float array of 6 float values to store prices
//        { 1.99,   0.99,    4,65,    3.89,       3.88,      2.88  }
//        assume that the order of grocery Items match the prices in same order.


        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"} ;

//        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f };


//      loop through each and print them in one line :

        for (String eachItem   : groceryItems ) {

            System.out.print( eachItem + "--->");

        }

            System.out.println();
//        print without the last arrow after the last word:    // arr[arr.length-1] --- last index

            int itemCount = groceryItems.length;
            int lastItemIndex = itemCount-1;
            String lastFruit = groceryItems[lastItemIndex]; // groceryItems[groceryItems.length-1] -> one shot solution


            for (String eachFruit   : groceryItems ) {

                System.out.print(eachFruit);
//              only print --> when it is not the last item
                if (!eachFruit.equals(lastFruit)) {

                    System.out.print("--->");

                }


            }


    }

}
