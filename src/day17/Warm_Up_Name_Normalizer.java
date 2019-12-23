package day17;

import java.awt.*;
import java.util.Scanner;

public class Warm_Up_Name_Normalizer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name : ");

        String name = scan.next();
//
//        System.out.println("name = " + name);
//
//       String name2= (name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
//
//        System.out.println("name2 = " + name2);
//
//
//        System.out.println("What your full name?");

//        String nameFixed = name.charAt(0)+"".toUpperCase();    // this approach converts char to string
//        nameFixed= nameFixed+name.substring(1).toLowerCase();
//
//        System.out.println(nameFixed);


        String nameFixed = name.toUpperCase().substring(0,1);   // another method: use substring and upper case
            nameFixed += name.substring(1).toLowerCase();

        System.out.println(nameFixed);


        // substring method copy the part of String inside another String
        // it has 2 version:
             // 1, start with certain index and end at ending index
            // 2, start with certain index then get the rest of the String





    }

}


// substring method copy the part of String inside another String
// it has 2 version :
// 1,  start with certain index and end at ending index
// 2,  start with certain index then get the rest of the String

// get the first character -->> make it uppercase
// get the rest of the characters starting from 2nd character
/// then make it lowercase
//  eventually concatenate them
//         String nameFixed = (name.charAt(0)+"").toUpperCase() ;
//                nameFixed = nameFixed + name.substring(1).toLowerCase();



// make whole name uppercase the get the first character
// get the rest of the characters starting from 2nd character
/// then make it lowercase
//  eventually concatenate them