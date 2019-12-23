package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {
        
        
        int[] ages = new int[] {3,5,22,57,18};  // if you want to count the size of your array
        
        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);


        for (int x = 0; x <=ages.length-1 ; x++) {

            System.out.println(ages[x]);

        }





    }
    
}
