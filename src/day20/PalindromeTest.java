package day20;

public class PalindromeTest {

    public static void main(String[] args) {
        
        // Homework replace the space so that the condition passes the test *************


        // if you reverse a string if it does not change it means       // this is a interview question
        //  the String is  (Palindrome)
        
        // examples : level, kayak , elle , madam , aziza 
        
        
        String name = "Kayak";

        
        String reversedName = "";
        
        for (int x = name.length()-1 ; x >= 0 ; --x ) {
            
            reversedName+=name.charAt(x);
            
            
            
            
        }

        System.out.println("reversedName = " + reversedName);
        System.out.println("name = " + name);



        if (name.equalsIgnoreCase(reversedName)) {          // check whether reverse name is equal or not

            System.out.println("Palindrome Test has passed");

        } else {

            System.out.println("Palindrome Tes failed");

        }
        
        
        
        
    }
    
    
}



//
//public class PalindromTest {
//    //given a String str w value, reverse the str
//    //store reversed value into another String str
//    public static void main(String[] args) {
//
//        String name ="A roza upala na lapu Azora";
//        String nameWoutSpaces=name.replace(" ","");
//        String reverseName ="";
//
//        for(int i=nameWoutSpaces.length()-1;i>=0;i--){
//            reverseName+=nameWoutSpaces.charAt(i);
//        }
//        if(nameWoutSpaces.equalsIgnoreCase(reverseName))
//            System.out.println("Palindrome!");
//        else
//            System.out.println("not a palindrome");
//
//        System.out.println("name = " + name);
//        System.out.println("reverseName = " + reverseName);
//    }